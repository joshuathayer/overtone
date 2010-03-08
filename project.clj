(defproject overtone "0.1"
  :description "An audio/musical experiment."
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0" ]
                 
                 [org.clojars.rosejn/jvi "0.7.1"]
                 [org.clojars.rosejn/jsyntaxpane "0.9.5-b27"]
                 [jfree/jfreechart "1.0.12"]
                 [vijual "0.1.0-SNAPSHOT"]
                 [jline "0.9.94"]
                 
                 [osc-clj "0.1"]
                 [byte-spec "0.1"]
                 [midi-clj "0.1"]
                 [overtone/clj-scsynth    "0.0.1-SNAPSHOT"]
                 [overtone/clj-jack       "0.0.1-SNAPSHOT"]
                 [overtone/clj-repl       "0.0.1-SNAPSHOT"]
                 [overtone/clj-scenegraph "0.0.1-SNAPSHOT"]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]
                     [autodoc "0.7.0"]
                     [jline "0.9.94"]
                     [org.clojars.ato/nailgun "0.7.1"]
                     [lein-nailgun "0.1.0"]
                     [swank-clojure "1.1.0-SNAPSHOT"]
                     [leiningen/lein-swank "1.1.0"]]
  :main overtone.app.repl)
