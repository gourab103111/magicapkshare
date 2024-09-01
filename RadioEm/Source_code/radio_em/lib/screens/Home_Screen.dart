import 'package:flutter/material.dart';

import '../controller/Home_controller.dart';
import '../util/fontcolors.dart';
import '../util/utils.dart';
import 'package:dio/dio.dart';
import '../util/widget_topbar.dart';

import 'dart:async';
import 'dart:convert';
import 'dart:io';
import 'dart:typed_data';

import 'package:flutter/material.dart';
import 'package:flutter_webview_pro/webview_flutter.dart';
import 'package:path_provider/path_provider.dart';
import 'package:get/get.dart';

import 'package:html/parser.dart';
import 'package:http/http.dart' as http;
import 'package:flutter_overlay_loader/flutter_overlay_loader.dart';

import 'Webviewdart.dart';

class Home_Screen extends StatefulWidget {
  Home_Screen({super.key});
  double _width = 0;
  double _height = 0;
  bool stopUpdate = false;

  List<Playlistsdata> listsdata = [];

  final dio = Dio();
  final mainplayurl =
      "https://stream4.radioem.pl/stream/?fbclid=IwAR2SfKgTqJELjQ0bBzZif_bET5rhp20MkBUTxAi-ZZ137L17aAaTj_6UDws";

  String TOJO_NEWS = "https://mobapki.pl/emkatowice/news/twojnews/";
  String LUDZIE_RADIA = "https://www.radioem.pl/doc/2666832.Ludzie-radia";
  String RAMoWKA = "https://www.radioem.pl/ramowka";
  String REKLAMA = "https://www.radioem.pl/Reklama";
  String KONTAKT = "https://www.radioem.pl/doc/2667007.Kontakt-z-redakcja";
  String WSPIERAJ = "https://www.radioem.pl/Wsparcie";

  final HomeController homecontroller = Get.put(HomeController());
  final HomeMediaController homeMediaController =
      Get.put(HomeMediaController());

  @override
  State<Home_Screen> createState() => _Home_ScreenState();
}

class _Home_ScreenState extends State<Home_Screen> {
  late Timer _timer;
  late Timer _timertwo;
  dynamic? progressLoading = null;

  @override
  void initState() {
    super.initState();

    getResentPlaytitle();
    getPlaylists();
    _timer = Timer.periodic(Duration(seconds: 15), (timer) {
      if (!widget.stopUpdate) {
        getResentPlaytitle();
      }
      // getPlaylists();
    });

    _timertwo = Timer.periodic(Duration(seconds: 30), (timer) {
      // if (widget.stopUpdate) {
      getPlaylists();
      //}
      // getPlaylists();
    });

    widget.homecontroller.playerUrlInit(widget.mainplayurl);
  }

  @override
  void dispose() {
    widget.homecontroller.stopPlayer();
    _timer.cancel();
    _timertwo.cancel();
    // TODO: implement dispose
    super.dispose();
  }

  void getPlaylists() async {
    print("ResponseData : Start 2 ");
    // final response =
    //     await widget.dio.get('https://www.radioem.pl/Audycje.json');
    // print("ResponseData : Start 1 ${response.data} ");
    // print(response);
    var response2 = await http.get(Uri.parse('https://www.radioem.pl/'));

    //If the http request is successful the statusCode will be 200
    if (response2.statusCode == 200) {
      String htmlToParse = response2.body;
      widget.listsdata.clear();

      // print("ResponseData5 : " + htmlToParse);

      var document = parse(htmlToParse);
      var rows = document.getElementsByClassName("prio0");
      //  print("ResponseData ${rows!.toString()}");
      int count = 0;
      // widget.listsdata.clear();
      rows.map((e) => e.innerHtml).forEach((element) {
        // print("ResponseData4  ${element.toString()}");
        var document2 = parse(element.toString());
        var title = "";
        var href = "";
        var imgsrc = "";

        if (document2.getElementsByTagName("a").length >= 1) {
          title = document2
              .getElementsByTagName("a")[0]
              .attributes["title"]
              .toString();

          href = document2
              .getElementsByTagName("a")[0]
              .attributes["href"]
              .toString();
        }

        if (document2.getElementsByTagName("img").length >= 1) {
          imgsrc = document2
              .getElementsByTagName("img")[0]
              .attributes["src"]
              .toString();
        }
        //var imgsrc = document2.getElementsByTagName("img")[0].attributes["src"];
        //print("ResponseData4  ${title.toString()}");
        // print("ResponseData4  ${imgsrc.toString()}");
        print("ResponseData4  ${href.toString()}");

        if (imgsrc.trim().length >= 1) {
          if (count <= 5) {
            widget.listsdata.add(Playlistsdata("${title}",
                "https://www.radioem.pl${href.toString()}", "https:${imgsrc}"));
          }

          count++;
        }
      });
      if (widget.listsdata.length >= 1) {
        widget.homecontroller.setUpDataLists(widget.listsdata);
      }
    }
  }

  void getMediaUrl(String medisString) async {
    // print("ResponseData : Start 1 ");
    // final response =
    //     await widget.dio.get('https://www.radioem.pl/Audycje.json');
    // print("ResponseData : Start 1 ${response.data} ");
    // print(response);
    var response2 = await http.get(Uri.parse(medisString));

    //If the http request is successful the statusCode will be 200
    if (response2.statusCode == 200) {
      String htmlToParse = response2.body;

      //  print("ResponseData : " + htmlToParse);

      var document = parse(htmlToParse);
      if (document.getElementsByTagName("audio").length >= 1) {
        var audioUrl = document
            .getElementsByTagName("audio")[0]
            .attributes["src"]
            .toString();

        audioUrl = "https://www.radioem.pl${audioUrl}";
        widget.homecontroller.playerUrlInitandPlay(audioUrl);

        print("ResponseData : " + audioUrl);
      }

      //  widget.homecontroller.setUpDataLists(listsdata);
    }
  }

  void getResentPlaytitle() async {
    // print("ResponseData : Start 1 ");
    // final response =
    //     await widget.dio.get('https://www.radioem.pl/Audycje.json');
    // print("ResponseData : Start 1 ${response.data} ");
    // print(response);
    var response2 = await http.get(Uri.parse('https://www.radioem.pl/Sluchaj'));

    //If the http request is successful the statusCode will be 200
    if (response2.statusCode == 200) {
      String htmlToParse = response2.body;

      //  print("ResponseData : " + htmlToParse);

      List<Playlistsdata> listsdata = [];
      var document = parse(htmlToParse);
      var rows = document.getElementsByClassName("current");
      //  print("ResponseData ${rows!.toString()}");
      int count = 0;
      rows.map((e) => e.innerHtml).forEach((element) {
        final newString =
            element.toString().replaceAll(RegExp(r'<span.*span>'), "");
        // print("ResponseData6 ${count}   ${newString}");
        widget.homeMediaController.setTitleOne("");
        widget.homeMediaController.setTitleTwo(newString);
        // var document2 = parse(element.toString());
        // var altimage =
        //     document2.getElementsByTagName("img")[0].attributes["alt"];
        // var srcImsge =
        //     document2.getElementsByTagName("img")[0].attributes["src"];
        // //  print("ResponseData4  ${altimage.toString()}");
        // print("ResponseData4  ${srcImsge.toString()}");
        // listsdata.add(Playlistsdata("${altimage}", "https:${srcImsge}"));

        count++;
      });

      //  widget.homecontroller.setUpDataLists(listsdata);
    }
  }

  void getResentPlaytitle2() async {
    // print("ResponseData : Start 1 ");
    final response = await widget.dio.get('https://rds.radioem.pl/rds0.txt');
    if (response.data != null) {
      List<dynamic> responseJson = json.decode(response.data);
      if (responseJson.length >= 2) {
        var titleone = responseJson[3];
        var titletwo = responseJson[2];
        widget.homeMediaController.setTitleOne(titleone);
        widget.homeMediaController.setTitleTwo(titletwo);
      }
    }
  }

  Widget showOptionMenu() {
    return Obx(() => widget.homecontroller.showmenu.value
        ? Container(
            width: double.infinity,
            height: double.infinity,
            decoration: BoxDecoration(color: Colors.black.withAlpha(80)),
            alignment: Alignment.topRight,
            child: Column(
              children: <Widget>[
                getMenuColumns(
                    widget._width, widget._height, "ramówka".toUpperCase(), () {
                  // Loader.show(
                  //   context,
                  //   progressIndicator:
                  //       CircularProgressIndicator(backgroundColor: Colors.red),
                  // );

                  widget.homecontroller.setWebUrl(widget.RAMoWKA);
                  // widget.showmenu = !widget.showmenu;
                  widget.homecontroller.toggleMenu();
                  widget.homecontroller.setWebView(true);

                  // showmenuoption();
                }, true),
                getMenuColumns(
                    widget._width, widget._height, "twój news".toUpperCase(),
                    () {
                  // Loader.show(
                  //   context,
                  //   progressIndicator:
                  //       CircularProgressIndicator(backgroundColor: Colors.red),
                  // );

                  widget.homecontroller.setWebView(true);
                  //widget.webUrl = widget.TOJO_NEWS;
                  widget.homecontroller.setWebUrl(widget.TOJO_NEWS);
                  widget.homecontroller.toggleMenu();

                  /// showmenuoption();
                }, true),
                getMenuColumns(
                    widget._width, widget._height, "ludzie radia".toUpperCase(),
                    () {
                  // Loader.show(
                  //   context,
                  //   progressIndicator:
                  //       CircularProgressIndicator(backgroundColor: Colors.red),
                  // );

                  widget.homecontroller.setWebView(true);
                  //widget.webUrl = widget.LUDZIE_RADIA;
                  widget.homecontroller.setWebUrl(widget.LUDZIE_RADIA);
                  widget.homecontroller.toggleMenu();

                  // showmenuoption();
                }, true),
                getMenuColumns(
                    widget._width, widget._height, "reklama".toUpperCase(), () {
                  // Loader.show(
                  //   context,
                  //   progressIndicator:
                  //       CircularProgressIndicator(backgroundColor: Colors.red),
                  // );

                  widget.homecontroller.setWebView(true);
                  // widget.webUrl = widget.REKLAMA;
                  widget.homecontroller.setWebUrl(widget.REKLAMA);
                  widget.homecontroller.toggleMenu();
                  // Loader.show(context,
                  //     progressIndicator: LinearProgressIndicator());

                  //  showmenuoption();
                }, true),
                getMenuColumns(
                    widget._width, widget._height, "kontakt".toUpperCase(), () {
                  //  showmenuoption();

                  // Loader.show(
                  //   context,
                  //   progressIndicator:
                  //       CircularProgressIndicator(backgroundColor: Colors.red),
                  // );

                  widget.homecontroller.setWebView(true);
                  //widget.webUrl = widget.KONTAKT;
                  widget.homecontroller.setWebUrl(widget.KONTAKT);
                  widget.homecontroller.toggleMenu();
                }, true),
                getMenuColumns(
                    widget._width, widget._height, "wspieraj".toUpperCase(),
                    () {
                  // Loader.show(
                  //   context,
                  //   progressIndicator:
                  //       CircularProgressIndicator(backgroundColor: Colors.red),
                  // );

                  widget.homecontroller.setWebView(true);
                  // widget.webUrl = widget.WSPIERAJ;
                  widget.homecontroller.setWebUrl(widget.WSPIERAJ);
                  widget.homecontroller.toggleMenu();

                  // showmenuoption();
                }, false),
              ],
            ),
          )
        : SizedBox.shrink());
  }

  void showmenuoption() {
    widget.homecontroller.toggleMenu();
  }

  @override
  Widget build(BuildContext context) {
    var _size = getSize(context);
    var _width = _size.width;
    var _height = _size.height;

    widget._width = _width;
    widget._height = _height;

    return Scaffold(
      appBar: null,
      body: SafeArea(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.start,
          children: <Widget>[
            Obx(() => homePageHeaderTop(
                _width,
                widget.homecontroller.showWebview.value
                    ? InkWell(
                        onTap: () {
                          widget.homecontroller.toggleWebview();
                        },
                        child: Image.asset(
                          'assets/images/arrow_back.png',
                          fit: BoxFit.contain,
                          width: _width * 0.05,
                          height: _width * 0.05,
                        ),
                      )
                    : Image.asset(
                        'assets/images/header_logo.png',
                        fit: BoxFit.contain,
                        width: _width * 0.12,
                        height: _width * 0.12,
                      ))),
            Container(
              padding: EdgeInsets.only(
                left: 6,
              ),
              decoration: BoxDecoration(color: topHederTwoColor),
              child: Row(
                children: <Widget>[
                  Flexible(
                    fit: FlexFit.tight,
                    flex: 10,
                    child: Padding(
                      padding: EdgeInsets.only(left: 4),
                      child: Row(
                        children: <Widget>[
                          Text(
                            "Radio eM",
                            style: TextStyle(fontSize: 18, color: redFontColor),
                          ),
                          Padding(
                            padding: EdgeInsets.only(left: 8),
                            child: Text(
                              "Katowice",
                              style: TextStyle(
                                  fontSize: 18, color: whiteFontColor),
                            ),
                          )
                        ],
                      ),
                    ),
                  ),
                  Obx(() => Flexible(
                      fit: FlexFit.tight,
                      flex: 2,
                      child: Container(
                        decoration: BoxDecoration(
                            color: widget.homecontroller.showmenu.value
                                ? redFontColor
                                : Colors.transparent),
                        child: InkWell(
                          onTap: () {
                            widget.homecontroller.toggleMenu();
                          },
                          child: SizedBox(
                            width: 80,
                            height: 60,
                            child: Padding(
                              padding: EdgeInsets.all(12.0),
                              child: Image.asset(
                                'assets/images/hamburger_menu.png',
                                fit: BoxFit.contain,
                              ),
                            ),
                          ),
                        ),
                      )))
                ],
              ),
            ),
            Flexible(
                flex: 10,
                fit: FlexFit.tight,
                child: Container(
                  decoration: BoxDecoration(
                    color: Colors.black,
                  ),
                  child: SizedBox(
                    width: double.infinity,
                    height: double.infinity,
                    child: Obx(() => Stack(
                          children: <Widget>[
                            Stack(
                              children: [
                                widget.homecontroller.showWebview.value
                                    ? loadWenPage()
                                    : SizedBox.shrink(),
                                !widget.homecontroller.showWebview.value
                                    ? mainBody()
                                    : SizedBox.shrink(),
                                !widget.homecontroller.showWebview.value
                                    ? mainBodyTwo()
                                    : SizedBox.shrink(),
                              ],
                            ),
                            showOptionMenu(),
                            bottomMenu()
                          ],
                        )),
                  ),
                ))
          ],
        ),
      ),
    );
  }

  Widget loadWenPage() {
    print(" widget.webUrl A:  ${widget.homecontroller.webUrl.value}");

    if (widget.homecontroller.showmenu.value) {
      return SizedBox.shrink();
    }

    // Future.delayed(const Duration(milliseconds: 500), () {

    //  });

    return WebviewDisplayDart(widget.homecontroller.webUrl.value);
  }

  Widget bottomMenu() {
    return Align(
      alignment: Alignment.bottomCenter,
      child: Container(
        decoration: BoxDecoration(color: Colors.black),
        child: Row(
          mainAxisSize: MainAxisSize.max,
          children: <Widget>[
            Flexible(
                fit: FlexFit.tight,
                flex: 2,
                child: InkWell(
                  onTap: () {
                    launchInBrowser(
                        Uri.parse("https://www.facebook.com/radioem"));
                  },
                  child: Padding(
                    padding: EdgeInsets.all(12.0),
                    child: Image.asset(
                      'assets/images/ic_fb_ft.png',
                      fit: BoxFit.contain,
                      width: 26,
                      height: 26,
                    ),
                  ),
                )),
            Flexible(
                fit: FlexFit.tight,
                flex: 2,
                child: InkWell(
                  onTap: () {
                    launchInBrowser(
                        Uri.parse("https://twitter.com/radio_em_107i6"));
                  },
                  child: Padding(
                    padding: EdgeInsets.all(12.0),
                    child: Image.asset(
                      'assets/images/ic_ve_bt.png',
                      fit: BoxFit.contain,
                      width: 26,
                      height: 26,
                    ),
                  ),
                )),
            Flexible(
                fit: FlexFit.tight,
                flex: 2,
                child: InkWell(
                  onTap: () {
                    launchInBrowser(Uri.parse(
                        "https://www.youtube.com/channel/UC7QTxM16AsFC9NFJoSu4fdw"));
                  },
                  child: Padding(
                    padding: EdgeInsets.all(12.0),
                    child: Image.asset(
                      'assets/images/ic_youtube_ft.png',
                      fit: BoxFit.contain,
                      width: 28,
                      height: 28,
                    ),
                  ),
                )),
            Flexible(
                fit: FlexFit.tight,
                flex: 2,
                child: InkWell(
                  onTap: () {
                    launchInBrowser(
                        Uri.parse("https://instagram.com/radio_em_katowice"));
                  },
                  child: Padding(
                    padding: EdgeInsets.all(12.0),
                    child: Image.asset(
                      'assets/images/ic_instagram_ft.png',
                      fit: BoxFit.contain,
                      width: 24,
                      height: 24,
                    ),
                  ),
                )),
            Flexible(
                fit: FlexFit.tight,
                flex: 2,
                child: InkWell(
                  onTap: () {
                    launchInBrowser(
                        Uri.parse("https://vm.tiktok.com/ZMNJgFneF/"));
                  },
                  child: Padding(
                    padding: EdgeInsets.all(8.0),
                    child: Image.asset(
                      'assets/images/ic_tiktok_ft.png',
                      fit: BoxFit.contain,
                      width: 24,
                      height: 24,
                    ),
                  ),
                ))
          ],
        ),
      ),
    );
  }

  Widget mainBodyTwo() {
    return Container(
      width: double.infinity,
      alignment: Alignment.topLeft,
      decoration: BoxDecoration(
          color: redFontColor,
          borderRadius: BorderRadius.only(
              topLeft: Radius.circular(34), topRight: Radius.circular(34))),
      margin: EdgeInsets.only(top: widget._height * 0.30),
      height: widget._height,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Padding(
            padding: EdgeInsets.only(top: 22, left: 20),
            child: Text(
              "podcasty".toUpperCase(),
              style: TextStyle(color: Colors.white, fontSize: 16),
            ),
          ),
          Expanded(
            child: Padding(
              padding: EdgeInsets.only(
                  left: 12, right: 12, top: 12, bottom: widget._height * 0.07),
              child: Stack(children: <Widget>[
                ListView.builder(
                  itemCount: widget.homecontroller.playlistsdata.length,
                  itemBuilder: (BuildContext ctx, int index) {
                    return getEachRows(
                        widget.homecontroller.playlistsdata[index]);
                  },
                ),
                widget.homecontroller.playlistsdata.length == 0
                    ? Center(
                        child: CircularProgressIndicator(),
                      )
                    : Stack()
              ]),
            ),
          )
        ],
      ),
    );
  }

  Widget getEachRows(Playlistsdata inputdata) {
    return InkWell(
      onTap: () {
        widget.stopUpdate = true;
        widget.homecontroller.showMedialoading();
        widget.homeMediaController.setTitleTwo(inputdata.title.toString());

        print(inputdata.href.toString());

        getMediaUrl(inputdata.href.toString());
        // widget.homecontroller.playerUrlInitandPlay(inputdata.href.toString());
      },
      child: Container(
        margin: EdgeInsets.only(bottom: 6),
        padding: EdgeInsets.all(8),
        decoration: BoxDecoration(color: Colors.black.withAlpha(90)),
        child: Row(
          mainAxisSize: MainAxisSize.max,
          mainAxisAlignment: MainAxisAlignment.start,
          children: [
            Flexible(
                flex: 4,
                fit: FlexFit.tight,
                child: SizedBox(
                  width: 100,
                  height: 100,
                  child: Container(
                    padding: EdgeInsets.all(8),
                    child: Image.network(inputdata.imageurl.toString()),
                  ),
                )),
            Flexible(
                flex: 8,
                fit: FlexFit.tight,
                child: Container(
                  padding: EdgeInsets.only(left: 12),
                  height: 100,
                  alignment: Alignment.centerLeft,
                  decoration: BoxDecoration(color: Colors.black),
                  child: Text(
                    inputdata.title.toString(),
                    style: TextStyle(color: Colors.white),
                  ),
                ))
          ],
        ),
      ),
    );
  }

  Widget eachRowsWithImage() {
    return Row(
      children: [
        Container(
          width: 60,
          height: 60,
          decoration: BoxDecoration(color: Colors.black54),
          child: SizedBox(
            width: 100,
            height: 100,
          ),
        )
      ],
    );
  }

  Widget mainBody() {
    dynamic _height = getSize(context).height;

    return Padding(
      padding: EdgeInsets.all(12),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Text(
            '${widget.homeMediaController.showTitleOne.value}',
            style: TextStyle(color: fontColor1, fontSize: 16),
          ),
          Padding(
            padding: EdgeInsets.only(top: 10),
            child: Text(
              '${widget.homeMediaController.showTitleTwo.value}',
              maxLines: 2,
              overflow: TextOverflow.ellipsis,
              style: TextStyle(color: Colors.white, fontSize: 24),
            ),
          ),
          Container(
            alignment: Alignment.centerRight,
            child: InkWell(
              onTap: () {
                //  widget.homecontroller.playerUrlInitandPlay(widget.mainplayurl);
              },
              child: InkWell(
                onTap: () {
                  getResentPlaytitle();

                  widget.stopUpdate = false;
                  widget.homecontroller.playerUrlInitandPlay(
                      "https://stream4.radioem.pl/stream/?fbclid=IwAR2SfKgTqJELjQ0bBzZif_bET5rhp20MkBUTxAi-ZZ137L17aAaTj_6UDws");
                },
                child: Text(
                  "Włącz Radio EM",
                  style: TextStyle(
                    fontSize: 16,
                    color: redFontColor,
                  ),
                ),
              ),
            ),
          ),
          Obx(() => Stack(
                children: [
                  widget.homecontroller.isplayerloading.value
                      ? Container(
                          margin: EdgeInsets.only(top: _height * 0.02),
                          width: 40,
                          height: 40,
                          child: CircularProgressIndicator(),
                        )
                      : SizedBox.shrink(),
                  Padding(
                    padding: EdgeInsets.only(left: 2, top: 18),
                    child: Row(
                      children: <Widget>[
                        InkWell(
                          onTap: () {
                            // widget.homecontroller.togglePlayer();
                            widget.homecontroller.starPlayer();
                          },
                          child: Image.asset(
                            widget.homecontroller.isPlaying.value
                                ? "assets/images/ic_play_icon.png"
                                : 'assets/images/ic_play_icon_off.png',
                            fit: BoxFit.contain,
                            width: widget._width * 0.10,
                          ),
                        ),
                        InkWell(
                          onTap: () {
                            widget.homecontroller.stopPlayer();
                          },
                          child: Padding(
                            padding: EdgeInsets.only(left: 6),
                            child: Image.asset(
                              widget.homecontroller.isPlaying.value
                                  ? 'assets/images/ic_pause_btn.png'
                                  : 'assets/images/ic_pause_btn_on.png',
                              fit: BoxFit.contain,
                              width: widget._width * 0.08,
                            ),
                          ),
                        ),
                        Padding(
                          padding: EdgeInsets.only(top: 14),
                          child: Column(
                            children: [
                              Container(
                                margin: EdgeInsets.only(
                                  left: 6,
                                ),
                                width: widget._width * 0.58,
                                height: widget._height * 0.004,
                                decoration: BoxDecoration(
                                    color: redFontColor,
                                    borderRadius: BorderRadius.circular(10)),
                              ),
                              Row(
                                mainAxisAlignment: MainAxisAlignment.start,
                                mainAxisSize: MainAxisSize.max,
                                children: [
                                  Text(
                                    "00:00",
                                    style: TextStyle(
                                        color: fontcolor2, fontSize: 12),
                                  ),
                                  SizedBox(
                                    width: widget._width * 0.38,
                                  ),
                                  Text(
                                    "00:00",
                                    style: TextStyle(
                                        color: fontcolor2, fontSize: 12),
                                  )
                                ],
                              )
                            ],
                          ),
                        ),
                        Container(
                          margin: EdgeInsets.only(left: 8, right: 6),
                          width: 4,
                          height: 4,
                          decoration: BoxDecoration(
                              color: redFontColor,
                              borderRadius: BorderRadius.circular(10)),
                        ),
                        Text(
                          "LIVE",
                          maxLines: 2,
                          overflow: TextOverflow.ellipsis,
                          style: TextStyle(color: Colors.white, fontSize: 12),
                        )
                      ],
                    ),
                  ),
                ],
              )),
        ],
      ),
    );
  }
}
