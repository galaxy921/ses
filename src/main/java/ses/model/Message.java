package ses.model;

import java.util.Date;

public class Message {
    //ID
    private Integer messageId;
    //发送人
    private Integer fromId;
    //接收人
    private Integer toId;
    //创建时间
    private Date createTime;
    //信息简介
    private String messageTitle;
    //信息详情
    private String messageDetails;
    //信息类型
    private Integer massageType;
    //信息状态
    private Integer massageState;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
    }

    public Integer getMassageType() {
        return massageType;
    }

    public void setMassageType(Integer massageType) {
        this.massageType = massageType;
    }

    public Integer getMassageState() {
        return massageState;
    }

    public void setMassageState(Integer massageState) {
        this.massageState = massageState;
    }
}
