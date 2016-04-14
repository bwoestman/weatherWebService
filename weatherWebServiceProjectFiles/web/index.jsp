<%--
  Created by IntelliJ IDEA.
  User: Bdub
  Date: 3/18/16
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Weather Web Service</title>
  </head>
  <body>
    <h1>Weather Web Service User Guide</h1>
    <h2>Request</h2>

    <ul>
      <li>Send GET request to
        <a href="http://tomcat-bwoestman.rhcloud.com/weatherWebServiceProjectFiles/weather">
          http://tomcat-bwoestman.rhcloud.com/weatherWebServiceProjectFiles/weather</a>
      </li>
      <li>Add key value pairs for latitude and longitude</li>
      <li>example: ?lat=41&lon=-89</li>
      <li>Full URL example:
        <a href="http://tomcat-bwoestman.rhcloud.com/weatherWebServiceProjectFiles/weather?lat=41&lon=-89">
          http://tomcat-bwoestman.rhcloud.com/weatherWebServiceProjectFiles/weather?lat=41&lon=-89</a>
      </li>
    </ul>
    <h2>Response</h2>
    <ul>
      <li>Contains JSON data for each of the next seven days</li>
      <li>Example for one day: {"daily": {"data":[{"cloudCover":"0","windSpeed":"3.14","temperatureMax":"52.15","temperatureMin":"29.35","precipProbability":"0"}]}}</li>
    </ul>
    <h2>DarkSky API</h2>
    <ul>
      <li>Data was pulled using DarkSky API</li>
      <li><a href="https://developer.forecast.io/">https://developer.forecast.io/</a></li>
    </ul>
  </body>
</html>