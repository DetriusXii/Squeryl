if test -f .sbtconfig; then
  . .sbtconfig
fi
exec $JAVA_HOME/bin/java ${SBT_OPTS} -jar sbt-launch.jar "$@"
