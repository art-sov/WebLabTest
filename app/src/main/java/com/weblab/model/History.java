package com.weblab.model;

public class History
{
    private Long id;
    private String title;
    private String url;
    private Long createdDate;
    private Long lastVisitedDate;
    private Long visits;
    private Long userEntered;

    public History(Long id, String title, String url, Long createdDate, Long lastVisitedDate,
                   Long visits, Long userEntered)
    {
        this.id = id;
        this.title = title;
        this.url = url;
        this.createdDate = createdDate;
        this.lastVisitedDate = lastVisitedDate;
        this.visits = visits;
        this.userEntered = userEntered;
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

    public Long getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate)
    {
        this.createdDate = createdDate;
    }

    public Long getLastVisitedDate()
    {
        return lastVisitedDate;
    }

    public void setLastVisitedDate(Long lastVisitedDate)
    {
        this.lastVisitedDate = lastVisitedDate;
    }

    public Long getVisits()
    {
        return visits;
    }

    public void setVisits(Long visits)
    {
        this.visits = visits;
    }

    public Long getUserEntered()
    {
        return userEntered;
    }

    public void setUserEntered(Long userEntered)
    {
        this.userEntered = userEntered;
    }
}
