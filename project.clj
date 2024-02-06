(defproject dactyl-keyboard "0.1.0-SNAPSHOT"
  :description "A parametrized, split-hand, concave, columnar, erogonomic keyboard"
  :url "http://example.com/FIXME"
  :main dactyl-keyboard.dactyl
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-auto "0.1.3"]
            [lein-exec "0.3.7"]
            [cider/cider-nrepl "0.24.0"]]
  :aliases {"generate" ["exec" "-p" "src/dactyl_keyboard/dactyl.clj"]}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [unicode-math "0.2.0"]
                 [scad-clj "0.5.3"]
                 [net.mikera/core.matrix "0.62.0"]
                 ])
