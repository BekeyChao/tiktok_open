package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class TemplateResult {

    private List<TemplateData> template_data;

    public List<TemplateData> getTemplate_data() {
        return template_data;
    }

    public void setTemplate_data(List<TemplateData> template_data) {
        this.template_data = template_data;
    }

    public static class TemplateData {

        private List<TemplateInfo> template_infos;

        private String logistics_code;

        public List<TemplateInfo> getTemplate_infos() {
            return template_infos;
        }

        public void setTemplate_infos(List<TemplateInfo> template_infos) {
            this.template_infos = template_infos;
        }

        public String getLogistics_code() {
            return logistics_code;
        }

        public void setLogistics_code(String logistics_code) {
            this.logistics_code = logistics_code;
        }

    }

}
