package xyz.bekey.tiktokOpen.domain;

public class CampaignInfo {
    private Long campaign_id;
    private String title;

    public Long getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(Long campaign_id) {
        this.campaign_id = campaign_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
