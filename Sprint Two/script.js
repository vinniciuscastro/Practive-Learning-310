function convertCurrency() {
    var amount = document.getElementById('amount').value;
    var rate = document.getElementById('currency').value;
    var convertedAmount = amount * rate;

    document.getElementById('result').innerHTML = 'Converted Amount: ' + convertedAmount.toFixed(2);
}