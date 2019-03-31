package ses.model;

public class project {
    //ID
    private Integer projectId;
    //项目
    private Integer projectName;
    //信息详情
    private String projectDetails;
    //附件文件
    private String projectFile;
    //中期报告
    private String projectReport;
    //评分
    private String score;
    //创建时间
    private String percentage;
    //项目状态
    private Integer projectState;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectName() {
        return projectName;
    }

    public void setProjectName(Integer projectName) {
        this.projectName = projectName;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public String getProjectFile() {
        return projectFile;
    }

    public void setProjectFile(String projectFile) {
        this.projectFile = projectFile;
    }

    public String getProjectReport() {
        return projectReport;
    }

    public void setProjectReport(String projectReport) {
        this.projectReport = projectReport;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public Integer getProjectState() {
        return projectState;
    }

    public void setProjectState(Integer projectState) {
        this.projectState = projectState;
    }
}
