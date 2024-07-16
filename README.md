# happyapi.google

<img src="HappyAPI.svg" alt="HappyAPI logo" width="200" align="right"/>

A Clojure library.
A generated interface to access Google APIs (sheets, youtube, bigquery etc) via [HappyAPI](https://github.com/timothypratley/happyapi).
Please see [HappyAPI](https://github.com/timothypratley/happyapi) for documentation.

## Contributing

Issues and suggestions are welcome.
Pull requests should be to HappyAPI, as this library is generated from there.

## Deploying

```
env CLOJARS_USERNAME=username CLOJARS_PASSWORD=clojars-token clojure -T:dev:build build/deploy
```

## License

Copyright © 2020 Timothy Pratley

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
