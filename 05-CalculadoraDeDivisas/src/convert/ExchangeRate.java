package convert;

class ExchangeRate {
  Currency fromCurrency;
  Currency toCurrency;

  double rate;

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

}
