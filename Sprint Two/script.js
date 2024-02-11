function convertCurrency() {
        
    const amount = document.getElementById('amount').value;


    const fromCurrency = document.getElementById('fromCurrency').value;
    const toCurrency = document.getElementById('toCurrency').value;

   
    const exchangeRates = {
        'USD': { 'EUR': 0.93, 'USD': 1 },
        'EUR': { 'USD': 1.08, 'EUR': 1 }
        // Add more currency rates as needed
    };

    // Calculate the converted amount
    const convertedAmount = amount * exchangeRates[fromCurrency][toCurrency];

    // Display the result
    document.getElementById('result').innerHTML = `Converted Amount: ${convertedAmount.toFixed(2)} ${toCurrency}`;
}