package xyz.bekey.tiktokOpen.domain;

public class FreightTemplate {

    private Template template;

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public static class Template {
        private Long id;
        //    private String name;
        private String template_name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

        public String getTemplate_name() {
            return template_name;
        }

        public void setTemplate_name(String template_name) {
            this.template_name = template_name;
        }
    }

}
