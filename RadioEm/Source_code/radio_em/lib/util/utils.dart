import 'package:flutter/widgets.dart';
import 'package:url_launcher/url_launcher.dart';

Size getSize(BuildContext context) {
  return MediaQuery.of(context).size;
}

Future<void> launchInBrowser(Uri url) async {
  if (!await launchUrl(url)) {
    throw Exception('Could not launch $url');
  }
}
