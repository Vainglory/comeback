package jf.pojo;

import java.util.Date;

public class SysOrganization {
    private String id;

    private Date createTime;

    private Date modifyTime;

    private Short version;

    private Byte status;

    private String name;

    private Short _parentId;

    private String address;

    private String phone;

    private String postCode;

    private String fax;

    private Integer type;

    private Integer orderNo;

    private String code;

    private String principalId;

    private String path;

    public SysOrganization() {

    }


    public SysOrganization(String id, Date createTime, Date modifyTime, Short version, Byte status, String name, Short _parentId, String address, String phone, String postCode, String fax, Integer type, Integer orderNo, String code, String principalId, String path) {
        this.id = id;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.version = version;
        this.status = status;
        this.name = name;
        this._parentId = _parentId;
        this.address = address;
        this.phone = phone;
        this.postCode = postCode;
        this.fax = fax;
        this.type = type;
        this.orderNo = orderNo;
        this.code = code;
        this.principalId = principalId;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short get_parentId() {
        return _parentId;
    }

    public void set_parentId(Short _parentId) {
        this._parentId = _parentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}