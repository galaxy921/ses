package ses.enums;

public enum ProjectStateEnum {
    STOP(-2,"终止"), WAIT(-1, "待审核"), CHECK(0, "审核中"),  PASS(1, "审核通过"), RUNNING(2, "进行中"), DISTRIBUTE(3, "未分配"), SCORE(4, "已评分");

    private int state;

    private String stateInfo;

    private ProjectStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static ProjectStateEnum stateOf(int index) {
        for (ProjectStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
