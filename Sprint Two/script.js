function httpGetAsync(url, callback) {
    const xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
            callback(xmlHttp.responseText);
        }
    };
    xmlHttp.open("GET", url, true); // true for asynchronous
    xmlHttp.send(null);
}

const url = "https://exchange-rates.abstractapi.com/v1/live/?api_key=6e2c4cc0ca704f15a5e67a41b3c09d97&base=USD&target=EUR";

// Define a callback function to handle the response
function handleApiResponse(response) {
    // Process the response as needed
    console.log(response);
}

// Make the API request
httpGetAsync(url, handleApiResponse);