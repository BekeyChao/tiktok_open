package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class CustomTemplateResult {

    private List<CustomTemplateData> custom_template_data;

    public List<CustomTemplateData> getCustom_template_data() {
        return custom_template_data;
    }

    public void setCustom_template_data(List<CustomTemplateData> custom_template_data) {
        this.custom_template_data = custom_template_data;
    }

    public static class CustomTemplateData{

        private String logistics_code;

        private List<CustomTemplateInfo>  custom_template_infos;

        public String getLogistics_code() {
            return logistics_code;
        }

        public void setLogistics_code(String logistics_code) {
            this.logistics_code = logistics_code;
        }

        public List<CustomTemplateInfo> getCustom_template_infos() {
            return custom_template_infos;
        }

        public void setCustom_template_infos(List<CustomTemplateInfo> custom_template_infos) {
            this.custom_template_infos = custom_template_infos;
        }

        public static class CustomTemplateInfo{

            private String custom_template_code;

            private String custom_template_url;

            private String custom_template_name;

            // 父模板code(查询标准模板API中返回的template_code)
            private String parent_template_code;

            public String getCustom_template_code() {
                return custom_template_code;
            }

            public void setCustom_template_code(String custom_template_code) {
                this.custom_template_code = custom_template_code;
            }

            public String getCustom_template_url() {
                return custom_template_url;
            }

            public void setCustom_template_url(String custom_template_url) {
                this.custom_template_url = custom_template_url;
            }

            public String getCustom_template_name() {
                return custom_template_name;
            }

            public void setCustom_template_name(String custom_template_name) {
                this.custom_template_name = custom_template_name;
            }

            public String getParent_template_code() {
                return parent_template_code;
            }

            public void setParent_template_code(String parent_template_code) {
                this.parent_template_code = parent_template_code;
            }
        }
    }
}
