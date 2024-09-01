import 'package:flutter/material.dart';

import '../util/utils.dart';

class Splash_Screen extends StatefulWidget {
  const Splash_Screen({super.key});

  @override
  State<Splash_Screen> createState() => _Splash_Screen();
}

class _Splash_Screen extends State<Splash_Screen> {
  @override
  Widget build(BuildContext context) {
    var _size = getSize(context);
    var _width = _size.width;
    var _height = _size.height;

    return Scaffold(
      appBar: null,
      body: Container(
        decoration: BoxDecoration(
            image: DecorationImage(
                image: AssetImage(
                  'assets/images/splash_bg.png',
                ),
                fit: BoxFit.cover)),
        child: Column(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.center,
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: <Widget>[
              Flexible(
                fit: FlexFit.tight,
                flex: 5,
                child: SizedBox.shrink(),
              ),
              Image.asset(
                'assets/images/radio_em_logo.png',
                fit: BoxFit.contain,
                width: _width * 0.66,
                height: _width * 0.66,
              )
            ]),
      ),
    );
  }
}
