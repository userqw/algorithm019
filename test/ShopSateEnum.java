public enum ShopSateEnum {
    CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功");
    private int state;
    private String stateInfo;

    ShopSateEnum(int state, String sateInfo) {
        this.state = state;
        this.stateInfo = sateInfo;
    }

    /*依据传入的state返回相应的enum值*/
    public static ShopSateEnum sateOf(int state){
        for (ShopSateEnum sateEnum:values()){
            if (sateEnum.getState() == state){
                return sateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }
}
