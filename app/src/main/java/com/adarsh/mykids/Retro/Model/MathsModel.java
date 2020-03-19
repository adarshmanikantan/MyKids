package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class MathsModel {

    /**
     * status : success
     * Videos : [{"maths_id":"1","title":"Time","image":"http://srishti-systems.info/projects/MyKids/Uploads/8418-untitled.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/566314-maths---time---understanding-time---class-1-ncert---in-english-480-x-640.mp4"},{"maths_id":"2","title":"Learn Addition using Story  Elementary Maths Concept","image":"http://srishti-systems.info/projects/MyKids/Uploads/728355-add.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/349214-learn-addition-using-story-elementary-maths-concept-for-kids-additio-466-x-854.mp4"},{"maths_id":"3","title":"Basic Addition ","image":"http://srishti-systems.info/projects/MyKids/Uploads/634467-adddd.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/730147-basic-addition-#aumsum-480-x-854.mp4"},{"maths_id":"4","title":"Addition for Kids","image":"http://srishti-systems.info/projects/MyKids/Uploads/23093-685.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/908152-addition-for-kids-in-hindi-(one-digit-number)---एक-अंकीय-संख्या-का-जोड़-480-x-854.mp4"},{"maths_id":"5","title":"Ascending and Descending Order","image":"http://srishti-systems.info/projects/MyKids/Uploads/914454-ass.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/853172-maths---ascending-and-descending-order---english-480-x-640.mp4"},{"maths_id":"6","title":"Money Basics for Children","image":"http://srishti-systems.info/projects/MyKids/Uploads/960885-moneyyy.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/725243-class-2-maths---money-maths-basics-for-children-cbse-board-480-x-854.mp4"},{"maths_id":"7","title":"Money","image":"http://srishti-systems.info/projects/MyKids/Uploads/430894-moneyyyuuuu.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/69724-cbse-class-1-maths-chapter-12---money-ncert---cbse-syllabus-grade-1-480-x-854.mp4"},{"maths_id":"8","title":"Data Handling","image":"http://srishti-systems.info/projects/MyKids/Uploads/875670-data.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/387792-data-handling-class-1st-maths---chapter-9-(part---1)-maths-for-clas-480-x-854.mp4"},{"maths_id":"9","title":"Greater and Smaller Calculation","image":"http://srishti-systems.info/projects/MyKids/Uploads/181089-greatwe.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/799467-studyndeals-ukg-maths-594-x-1280.mp4"},{"maths_id":"10","title":"Before & After Numbers","image":"http://srishti-systems.info/projects/MyKids/Uploads/591153-before.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/696246-before-and-after-numbers-for-kids-numbers-0-to-9-maths-concept-for-k-480-x-656.mp4"},{"maths_id":"11","title":"Multiplication Tables","image":"http://srishti-systems.info/projects/MyKids/Uploads/915594-tables.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/303012-multiplication-tables.mp4"},{"maths_id":"12","title":"Learn Counting  Number Song 1 to 100 ","image":"http://srishti-systems.info/projects/MyKids/Uploads/151239-before.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/719921-count-to-1-100-learn-counting-number-song-1-to-100-one-to-hundred-m-480-x-854.mp4"},{"maths_id":"13","title":"Measure Length For Kids ","image":"http://srishti-systems.info/projects/MyKids/Uploads/341752-beforett.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/207028-measure-length-for-kids-grade-1-maths-for-kids-periwinkle-480-x-656.mp4"}]
     */

    private String status;
    private List<VideosBean> Videos;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<VideosBean> getVideos() {
        return Videos;
    }

    public void setVideos(List<VideosBean> Videos) {
        this.Videos = Videos;
    }

    public static class VideosBean {
        /**
         * maths_id : 1
         * title : Time
         * image : http://srishti-systems.info/projects/MyKids/Uploads/8418-untitled.png
         * video : http://srishti-systems.info/projects/MyKids/Uploads/566314-maths---time---understanding-time---class-1-ncert---in-english-480-x-640.mp4
         */

        private String maths_id;
        private String title;
        private String image;
        private String video;

        public String getMaths_id() {
            return maths_id;
        }

        public void setMaths_id(String maths_id) {
            this.maths_id = maths_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }
    }
}
