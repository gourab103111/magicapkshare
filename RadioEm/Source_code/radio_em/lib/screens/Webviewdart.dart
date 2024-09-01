import 'dart:async';

import 'package:flutter/material.dart';

import 'package:flutter_webview_pro/webview_flutter.dart';
import 'package:url_launcher/url_launcher.dart';

class WebviewDisplayDart extends StatefulWidget {
  WebviewDisplayDart(this.weburl, {super.key});
  String weburl = "";
  final Completer<WebViewController> webViewController =
      Completer<WebViewController>();

  @override
  State<WebviewDisplayDart> createState() => _WebviewDisplayDartState();
}

class _WebviewDisplayDartState extends State<WebviewDisplayDart> {
  bool isLoading = true;

  Future<void> _makePhoneCall(String phoneNumber) async {
    final Uri launchUri = Uri(
      scheme: 'tel',
      path: phoneNumber,
    );
    await launchUrl(launchUri);
  }

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: <Widget>[
        WebView(
          initialUrl: widget.weburl,
          // initialUrl: 'https://flutter.dev',
          javascriptMode: JavascriptMode.unrestricted,

          onWebViewCreated: (WebViewController webViewController) {
            // _controller.complete(webViewController);

            widget.webViewController.complete(webViewController);
          },
          onProgress: (int progress) {
            print('WebView is loading (progress : $progress%)');
          },
          javascriptChannels: <JavascriptChannel>{
            //_toasterJavascriptChannel(context),
          },
          navigationDelegate: (NavigationRequest request) {
            if (request.url.startsWith('https://www.youtube.com/')) {
              print('blocking navigation to $request}');
              return NavigationDecision.prevent;
            }

            if (request.url.startsWith('tel:')) {
              var phoneNumber = request.url
                  .replaceAll("tel", "")
                  .replaceAll(":", "")
                  .replaceAll("/", "")
                  .trim();
              print('phoneNumber ${phoneNumber}');

              _makePhoneCall(phoneNumber);
              // print('blocking navigation to $request}');
              return NavigationDecision.prevent;
            }
            print('allowing navigation to 2 ${request.url}');
            //    print('allowing navigation to $request');
            return NavigationDecision.navigate;
          },
          onPageStarted: (String url) {
            print('Page started loading: $url');
          },
          onPageFinished: (String url) {
            print('Page finished loading: $url');

            setState(() {
              isLoading = false;
            });
          },
          gestureNavigationEnabled: true,
          backgroundColor: const Color(0x00000000),
          geolocationEnabled: true, // set geolocationEnable true or not
        ),
        isLoading
            ? Center(
                child: CircularProgressIndicator(),
              )
            : Stack(),
      ],
    );
  }
}
