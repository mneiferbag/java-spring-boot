setlocal
set JAVA_HOME=%USERPROFILE%\.jdks\adopt-openjdk-11.0.10
set PATH=%JAVA_HOME%\bin;%PATH%
%PUBLIC%\Portable\tcases-3.7.2\bin\tcases-api-test.bat -o ..\src\test\java\eu\mneifercons\examples\spring ..\doc\api_v3.yaml
