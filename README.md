Java's `UncaughtExceptionHandler` compiles correctly on Scala.JS `0.6.32` but it throws linking errors on `1.0.0`:

``` 
[error] Referring to non-existent class java.lang.Thread$UncaughtExceptionHandler
[error]   called from UncaughtExceptionHandlerTest$.main([java.lang.String)void
[error]   called from static UncaughtExceptionHandlerTest.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   UncaughtExceptionHandlerTest$
[error] Referring to non-existent class java.lang.Thread$UncaughtExceptionHandler
[error]   called from UncaughtExceptionHandlerTest$$anon$1
[error]   called from UncaughtExceptionHandlerTest$.main([java.lang.String)void
[error]   called from static UncaughtExceptionHandlerTest.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   UncaughtExceptionHandlerTest$
[error] There were linking errors
[error] (Compile / fastOptJS) There were linking errors
```


To reproduce:

``` 
sbt fastOptJS
```

Then change the version in [project/plugins.sbt](./project/plugins.sbt) and run again to compare