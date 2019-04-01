(defproject starcity/shutdown "0.1.0"

  :description "Manage a clojure application's shutdown hooks."

  :url "https://github.com/starcity-properties/shutdown"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :plugins [[s3-wagon-private "1.2.0"]]

  :repositories [["releases" {:url        "s3://starjars/releases"
                              :username   :env/aws_access_key
                              :passphrase :env/aws_secret_key}]])
