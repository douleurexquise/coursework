public class Client {
    private String name;
    private String account;
    private String address;
    private String bankAccount;
    private List<assets> assetsList;
    private List<finAssets> finAssetsList;

    public List<finAssets> getFinAssetsList() {
        return finAssetsList;
    }

    public void setFinAssetsList(List<finAssets> finAssetsList) {
        this.finAssetsList = finAssetsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<assets> getAssetsList() {
        return assetsList;
    }

    public void setAssetsList(List<assets> assetsList) {
        this.assetsList = assetsList;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
