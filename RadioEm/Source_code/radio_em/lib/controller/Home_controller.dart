import 'package:get/get.dart';
import 'package:just_audio/just_audio.dart';

class Playlistsdata {
  String title = "";
  String href = "";
  String imageurl = "";
  Playlistsdata(this.title, this.href, this.imageurl);
}

class HomeMediaController extends GetxController {
  final showTitleTwo = "----".obs;
  final showTitleOne = "---".obs;

  setTitleOne(String title) {
    showTitleOne.value = title;
  }

  setTitleTwo(String title) {
    showTitleTwo.value = title;
  }
}

class HomeController extends GetxController {
  @override
  void onReady() {
    // TODO: implement onReady
    super.onReady();
    player.playerStateStream.listen((state) {
      switch (state.processingState) {
        case ProcessingState.idle:
          isplayerloading.value = true;
          break;
        case ProcessingState.loading:
          isplayerloading.value = true;
          break;
        case ProcessingState.buffering:
          isplayerloading.value = true;
          break;
        case ProcessingState.ready:
          isplayerloading.value = false;
          break;
        case ProcessingState.completed:
          isplayerloading.value = false;
          break;
      }
    });
  }

  final showmenu = false.obs;
  final isplayerloading = false.obs;
  final showWebview = false.obs;
  final isPlaying = false.obs;

  final playlistsdata = <Playlistsdata>[].obs;

  final webUrl = "".obs;
  final mainMediaUrl =
      "https://stream4.radioem.pl/stream/?fbclid=IwAR2SfKgTqJELjQ0bBzZif_bET5rhp20MkBUTxAi-ZZ137L17aAaTj_6UDws"
          .obs;

  AudioPlayer player = AudioPlayer(
    userAgent: 'myradioapp/1.0 (Linux;Android 11) https://myradioapp.com',
  ); // Create a player
  dynamic duration = "".obs;

  toggleMenu() => showmenu.value = !showmenu.value;
  toggleWebview() => showWebview.value = !showWebview.value;

  setMenue(bool value1) => showmenu.value = value1;
  setWebView(bool value1) => showWebview.value = value1;
  setWebUrl(String newurl) => webUrl.value = newurl;
  setUpDataLists(List<Playlistsdata> playlistsdata2) =>
      playlistsdata.value = playlistsdata2;

  playerUrlInit(String playerurl) async {
    await player.setUrl(playerurl, preload: false);

    await player.load();
    // duration = await player.setUrl(// Load a URL
    //     mainMediaUrl.value);
  }

  showMedialoading() async {
    isPlaying.value = false;
  }

  playerUrlInitandPlay(String playerurl) async {
    print(" playerurl =>  ${playerurl} ");

    isPlaying.value = false;

    await player.setUrl(playerurl, preload: false);

    await player.load();

    // duration = await player.setUrl(// Load a URL
    //     playerurl);
    //
    isPlaying.value = true;

    await player.play();
  }

  starPlayer() async {
    isPlaying.value = true;

    await player.play();
  }

  stopPlayer() async {
    isPlaying.value = false;
    await player.pause();
  }

  togglePlayer() async {
    if (isPlaying.value)
      player.play();
    else {
      await player.pause();
    }
    isPlaying.value = !isPlaying.value;
  }
}
