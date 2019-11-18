package com.weblab.model;

public class Bookmarks
{
    private Long id;
    private String title;
    private String url;
    private Long isFolder;
    private Long parent;
    private Long position;
    private Long insertAfter;
    private Long isDeleted;
    private String accountName;
    private String accountType;
    private String sourceId;
    private Long version;
    private Long dateCreated;
    private Long dateModified;
    private Long dirty;
    private String sync1;
    private String sync2;
    private String sync3;
    private String sync4;
    private String sync5;

    public Bookmarks(Long id, String title, String url, Long isFolder, Long parent, Long position,
                     Long insertAfter, Long isDeleted, String accountName, String accountType,
                     String sourceId, Long version, Long dateCreated, Long dateModified, Long dirty,
                     String sync1, String sync2, String sync3, String sync4, String sync5)
    {
        this.id = id;
        this.title = title;
        this.url = url;
        this.isFolder = isFolder;
        this.parent = parent;
        this.position = position;
        this.insertAfter = insertAfter;
        this.isDeleted = isDeleted;
        this.accountName = accountName;
        this.accountType = accountType;
        this.sourceId = sourceId;
        this.version = version;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.dirty = dirty;
        this.sync1 = sync1;
        this.sync2 = sync2;
        this.sync3 = sync3;
        this.sync4 = sync4;
        this.sync5 = sync5;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public Long getIsFolder()
    {
        return isFolder;
    }

    public void setIsFolder(Long isFolder)
    {
        this.isFolder = isFolder;
    }

    public Long getParent()
    {
        return parent;
    }

    public void setParent(Long parent)
    {
        this.parent = parent;
    }

    public Long getPosition()
    {
        return position;
    }

    public void setPosition(Long position)
    {
        this.position = position;
    }

    public Long getInsertAfter()
    {
        return insertAfter;
    }

    public void setInsertAfter(Long insertAfter)
    {
        this.insertAfter = insertAfter;
    }

    public Long getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Long isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public String getSourceId()
    {
        return sourceId;
    }

    public void setSourceId(String sourceId)
    {
        this.sourceId = sourceId;
    }

    public Long getVersion()
    {
        return version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getDateCreated()
    {
        return dateCreated;
    }

    public void setDateCreated(Long dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    public Long getDateModified()
    {
        return dateModified;
    }

    public void setDateModified(Long dateModified)
    {
        this.dateModified = dateModified;
    }

    public Long getDirty()
    {
        return dirty;
    }

    public void setDirty(Long dirty)
    {
        this.dirty = dirty;
    }

    public String getSync1()
    {
        return sync1;
    }

    public void setSync1(String sync1)
    {
        this.sync1 = sync1;
    }

    public String getSync2()
    {
        return sync2;
    }

    public void setSync2(String sync2)
    {
        this.sync2 = sync2;
    }

    public String getSync3()
    {
        return sync3;
    }

    public void setSync3(String sync3)
    {
        this.sync3 = sync3;
    }

    public String getSync4()
    {
        return sync4;
    }

    public void setSync4(String sync4)
    {
        this.sync4 = sync4;
    }

    public String getSync5()
    {
        return sync5;
    }

    public void setSync5(String sync5)
    {
        this.sync5 = sync5;
    }
}