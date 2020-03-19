package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class GrowthStageModel {

    /**
     * status : success
     * stages : [{"id":"1","title":"Prenatal","description":"Pregnancy is a time of anticipation, excitement, preparation, and, for many new parents, uncertainty. The nine months of pregnancy will give you time to have your questions answered, calm your fears, and prepare yourself for the realities of parenthood."},{"id":"2","title":"Baby: 0-12 mos.","description":"It doesnt take long to develop the confidence and calm of an experienced parent. Your baby will give you the most important information - how she likes to be treated, talked to, held, and comforted."},{"id":"3","title":"Toddler: 1-3 yrs.","description":"Your child is advancing from infancy toward and into the preschool years. During this time, his physical growth and motor development will slow, but you can expect to see some tremendous intellectual, social, and emotional changes."},{"id":"4","title":"Preschool: 3-5 yrs.","description":"Your child is advancing from infancy toward and into the preschool years. During this time, his physical growth and motor development will slow, but you can expect to see some tremendous intellectual, social, and emotional changes."},{"id":"5","title":"Gradeschooler: 5-10 yrs.","description":"Your child should feel confident in her ability to meet the challenges in her life. This sense of personal power evolves from having successful life experiences in solving problems independently, being creative and getting results for her efforts."}]
     */

    private String status;
    private List<StagesBean> stages;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<StagesBean> getStages() {
        return stages;
    }

    public void setStages(List<StagesBean> stages) {
        this.stages = stages;
    }

    public static class StagesBean {
        /**
         * id : 1
         * title : Prenatal
         * description : Pregnancy is a time of anticipation, excitement, preparation, and, for many new parents, uncertainty. The nine months of pregnancy will give you time to have your questions answered, calm your fears, and prepare yourself for the realities of parenthood.
         */

        private String id;
        private String title;
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
