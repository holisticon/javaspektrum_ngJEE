Angular-basierte CordovaApp
=========================

Einfache Demo App die AngularJS mit Cordova zu einer hybriden App für iOS kombiniert. Nutzt [Mobile Angular UI](https://github.com/mcasimir/mobile-angular-ui) als UI-Framework

## Entwicklung

### Voraussetzungen
* JDK 7+
* Maven 3+
* Ruby
* IntelliJ IDEA / Eclipse (IDEA bietet direkt AngularJS Unterstütztung, für Eclipse: https://github.com/angelozerr/angularjs-eclipse)

### Lokale Einrichtung
* NodeJS und NPM installieren (http://nodejs.org/download/)
* Compass installieren
  * `(sudo) gem install compass`
* Apache Cordova installieren
  * `(sudo) npm install -g cordova`
* Installieren der Build Tools
  * `(sudo) npm install -g grunt-cli`
  * `(sudo) npm install -g cordova-gen-icon` (optional, siehe https://bitbucket.org/ntakimura/cordova-gen-icon)
  * `(sudo) npm install -g bower` 
  * `cd app`
  * `npm install`
  * `bower install`
  * `grunt`
  * `grunt server` (Bei Fehlern wg. fehlende Modulen einfach ein `sudo chmod –R 777` . im aktuellen Verzeichnis ausführen)

>In einigen Umgebung sind sudo-Recht nötig

Zur Entwicklung am besten Chrome/Chromium nutzen

Dieser sollte mit dem Parameter --disable-web-security, z.B. unter OS X:
``open /Applications/Google\ Chrome.app --args --disable-web-security ``

Das ist nur nötig, weil sonst wg. XSS u.Ä. AngularJS in der lokalen Entwicklung sonst nicht funktioniert. 

Die URL für die lokale Entwicklung ist http://localhost:9000

## Mobile Plattformen

### iOS

Build für iOS anstoßen
* ```cordova prepare ios```
* Projekt in Xcode öffnen

### Android
* [ADT](https://developer.android.com/sdk/index.html) installieren
* ```cordova plattform add android```

Generell muss man beachten, dass WebSockets erst ab Android [4.4](http://caniuse.com/#feat=websockets) funktionieren.
Das lässt sich aber mit einem [Plugin](https://github.com/mkuklis/phonegap-websocket/blob/master/www/phonegap-websocket.js) auch für ältere Versionen umsetzen.