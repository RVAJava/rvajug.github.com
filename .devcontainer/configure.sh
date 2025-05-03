#!/bin/bash

source "/usr/local/sdkman/bin/sdkman-init.sh"
sdk install quarkus
sdk install jbang
jbang trust add https://github.com/quarkiverse/quarkus-roq/blob/HEAD/roq.java
jbang app install --verbose --fresh --force roq@quarkiverse/quarkus-roq
