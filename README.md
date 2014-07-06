## "Open Application" Cordova Plugin

This plugin allow you to open external application in Android from your JavaScript code. Android only so far!

### Usage

Usage is easy as a pie:

```javascript
window.OpenApplication("com.google.android.gm"); // opens stock Gmail app.
```

No that this should be called after *deviceready* is fired, for example:
```javascript
var openFn = function() {
   window.OpenApplication(app_package);
};
document.addEventListener('deviceready', openFn, false);
```

### Instalation
```
cordova plugin add https://github.com/kulak-at/cordova-application-open-plugin.git
```

### Licence

Released under Apache License 2.0.
