# WeatherWebService User Guide
## Request
* Send GET request to url: http://tomcat-bwoestman.rhcloud.com/weatherWebServiceProjectFiles/weather
* Add key value pairs for latitude and longitude
    *  example: ?lat=41&lon=-89
    * full url example: http://tomcat-bwoestman.rhcloud.com/weatherWebServiceProjectFiles/weather?lat=41&lon=-89
    
## Response
* Contains JSON data for each of the next seven days
* Example for one day: {"daily": {"data":[{"cloudCover":"0","windSpeed":"3.14","temperatureMax":"52.15","temperatureMin":"29.35","precipProbability":"0"}]}}