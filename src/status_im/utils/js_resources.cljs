(ns status-im.utils.js-resources
  (:require-macros [status-im.utils.slurp :refer [slurp slurp-bot]])
  (:require [status-im.utils.types :refer [json->clj]]))

(def default-contacts (json->clj (slurp "resources/default_contacts.json")))

(def wallet-js (slurp-bot :wallet))

(def console-js (slurp-bot :console "web3_metadata.js"))

(def browse-js (slurp-bot :browse))

(def mailman-js (slurp-bot :mailman ))

(def commands-js wallet-js)

(def status-js (str (slurp "resources/status.js")
                    (slurp "resources/i18n.js")))

(def dapp-js (str (slurp "resources/dapp.js")))

(def webview-js (slurp "resources/webview.js"))
(def jquery (str
              " if (typeof jQuery2 == 'undefined') {"
              (slurp "resources/jquery-3.1.1.min.js")
              "}"))
(def web3 (str "; if (typeof Web3 == 'undefined') {"
               (slurp "resources/web3.0_16_0.min.js")
               "}"))
(def web3-init (slurp "resources/web3_init.js"))
