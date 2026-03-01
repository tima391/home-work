package lab6H;

class BankObserver implements IObserver {
    @Override
    public void update(double rate) {
        System.out.println("[Банк] Обновил курс на табло: " + rate);
    }
}

class NewsObserver implements IObserver {
    @Override
    public void update(double rate) {
        System.out.println("[Новости] Срочное сообщение: Курс валют " + rate);
    }
}

class BrokerObserver implements IObserver {
    @Override
    public void update(double rate) {
        System.out.println("[Брокер] Анализирует график для курса: " + rate);
    }
}