import 'package:flutter/material.dart';

import 'fontcolors.dart';

Widget homePageHeaderTop(_width, imagewidget) {
  return Expanded(
    child: Container(
      decoration: BoxDecoration(
        color: Colors.white,
      ),
      child: Row(
        children: <Widget>[
          Flexible(
            flex: 2,
            fit: FlexFit.tight,
            child: imagewidget,
          ),
          Flexible(
            flex: 6,
            fit: FlexFit.tight,
            child: Image.asset(
              'assets/images/header_top.png',
              fit: BoxFit.contain,
            ),
          )
        ],
      ),
    ),
  );
}

Widget getMenuColumns(
    _width, _height, String textlabel, Function() param3, bool isshow) {
  return Column(
    children: <Widget>[
      InkWell(
        onTap: param3,
        child: Container(
          alignment: Alignment.center,
          width: _width * 0.60,
          height: _height * 0.06,
          decoration: BoxDecoration(color: redFontColor),
          child: Text(
            textlabel,
            style: TextStyle(
              color: Colors.white,
              fontSize: 16,
            ),
          ),
        ),
      ),
      isshow
          ? Container(
              width: _width * 0.60,
              height: _height * 0.002,
              decoration: BoxDecoration(color: Colors.black),
            )
          : SizedBox.shrink()
    ],
  );
}

Widget dropdownMenuOption(_height, _width) {
  return Container(
    alignment: Alignment.topRight,
    child: Column(
      children: <Widget>[
        getMenuColumns(_width, _height, "ramówka".toUpperCase(), () {}, true),
        getMenuColumns(_width, _height, "twój news".toUpperCase(), () {}, true),
        getMenuColumns(
            _width, _height, "ludzie radia".toUpperCase(), () {}, true),
        getMenuColumns(_width, _height, "reklama".toUpperCase(), () {}, true),
        getMenuColumns(_width, _height, "kontakt".toUpperCase(), () {}, true),
        getMenuColumns(_width, _height, "wspieraj".toUpperCase(), () {}, false),
      ],
    ),
  );
}
