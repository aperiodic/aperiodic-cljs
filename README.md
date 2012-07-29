# A simple clojurescript template

This is what I consider a bare-bones starting point for clojurescript
development. It contains a simple compojure app that serves a hiccup-rendered
page that loads the compiled clojurescript.

## Usage

To create a new leiningen project with this template, run `lein new
aperiodic-cljs <project-name>`. Note that this requires lein2.

Once the project has been created, cd to its root, compile the clojurescript
with `lein cljsbuild once`, and start the development server with `lein ring
server`. You should be greeted with an alert that says `<project-name> lives!`.
If something goes wrong, open an issue!

## License

Copyright © 2012 Dan Lidral-Porter

Distributed under the Eclipse Public License, the same as Clojure.
