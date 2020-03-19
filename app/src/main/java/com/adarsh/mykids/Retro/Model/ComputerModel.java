package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class ComputerModel {

    /**
     * status : success
     * Videos : [{"computer_id":"1","title":"Parts of Computer and their functions","image":"http://srishti-systems.info/projects/MyKids/Uploads/185947-computer.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/755018-parts-of-computer-and-their-functions-class-3-720-x-1280.mp4"},{"computer_id":"2","title":"It's Time to Give Your Child a Computer","image":"http://srishti-systems.info/projects/MyKids/Uploads/400897-www.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/465677-it's-time-to-give-your-child-a-computer-480-x-854.mp4"},{"computer_id":"3","title":"Computer Quiz","image":"http://srishti-systems.info/projects/MyKids/Uploads/661052-quiz.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/492881-computer-quiz---computer-questions-and-answers---learning-computer-gk-720-x-1280.mp4"},{"computer_id":"4","title":"Computer a Machine","image":"http://srishti-systems.info/projects/MyKids/Uploads/866789-quiz.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/800387-computer-a-machine-(class-1)-720-x-1280.mp4"},{"computer_id":"5","title":"Computer Keyboard","image":"http://srishti-systems.info/projects/MyKids/Uploads/142776-key.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/176262-computer-keyboard-class-1-1080-x-1920.mp4"},{"computer_id":"6","title":"Do's and Don'ts of using a Computer","image":"http://srishti-systems.info/projects/MyKids/Uploads/422039-keys.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/511413-do\u2019s-and-don\u2019ts-of-using-a-computer-class-1-720-x-1280.mp4"},{"computer_id":"7","title":"Parts of Computer","image":"http://srishti-systems.info/projects/MyKids/Uploads/730848-cooo.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/501160-class-1-parts-of-computer-cbse-ncert-computers-480-x-854.mp4"},{"computer_id":"8","title":"Computer Introduction","image":"http://srishti-systems.info/projects/MyKids/Uploads/958272-yy.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/326327-class-3-computer-introduction-in-hindi-480-x-854.mp4"}]
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
         * computer_id : 1
         * title : Parts of Computer and their functions
         * image : http://srishti-systems.info/projects/MyKids/Uploads/185947-computer.png
         * video : http://srishti-systems.info/projects/MyKids/Uploads/755018-parts-of-computer-and-their-functions-class-3-720-x-1280.mp4
         */

        private String computer_id;
        private String title;
        private String image;
        private String video;

        public String getComputer_id() {
            return computer_id;
        }

        public void setComputer_id(String computer_id) {
            this.computer_id = computer_id;
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
