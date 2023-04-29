abstract class Transport {
    private String marka;

    public Transport(String marka) {
        this.marka = marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void startTheTransport() {
        System.out.println(getMarka() + " готов");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "marka='" + marka + '\'' +
                '}';
    }
}

