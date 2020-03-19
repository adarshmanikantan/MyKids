package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class ScienceModel {

    /**
     * status : success
     * Videos : [{"vid_id":"1","title":"Potential and Kinetic Energy ","image":"http://srishti-systems.info/projects/MyKids/Uploads/406276-energy.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/473609-potential-and-kinetic-energy-#aumsum-360-x-640.mp4"},{"vid_id":"2","title":"Uses of water","image":"http://srishti-systems.info/projects/MyKids/Uploads/656638-water.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/803220-water-science-basics-for-kids-science-for-class-1-360-x-640.mp4"},{"vid_id":"3","title":"What is Science","image":"http://srishti-systems.info/projects/MyKids/Uploads/94361-science.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/524676-what-is-science-introduction-to-science-letstute-240-x-426.mp4"},{"vid_id":"4","title":"How Rockets Work","image":"http://srishti-systems.info/projects/MyKids/Uploads/574622-rocket.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/219773-rocket-science-how-rockets-work---a-short-and-basic-explanation-480-x-854.mp4"},{"vid_id":"5","title":"Day and Night Explanation","image":"http://srishti-systems.info/projects/MyKids/Uploads/812242-day.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/42820-day-and-night-explanation,causes-science-for-kids-360-x-640.mp4"},{"vid_id":"6","title":"SCIENCE EXPERIMENTS","image":"http://srishti-systems.info/projects/MyKids/Uploads/170178-craft.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/384629-18-easy-school-magic-tricks-and-science-experiments-360-x-360.mp4"},{"vid_id":"7","title":"2 easy science experiments","image":"http://srishti-systems.info/projects/MyKids/Uploads/75214-craft1.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/509649-2-easy-science-experiments-[pt-7]-480-x-854.mp4"},{"vid_id":"8","title":"Food Chains","image":"http://srishti-systems.info/projects/MyKids/Uploads/866319-craft11.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/572420-food-chains-for-kids-food-webs,-the-circle-of-life,-and-the-flow-of-en-480-x-854.mp4"},{"vid_id":"9","title":"Food Chain  Food Web","image":"http://srishti-systems.info/projects/MyKids/Uploads/699853-craft12.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/409492-food-chain-food-web-video-for-kids-480-x-854.mp4"},{"vid_id":"10","title":"8 Ways Kids Can Help the Environment","image":"http://srishti-systems.info/projects/MyKids/Uploads/946276-craft13.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/29012-8-ways-kids-can-help-the-environment---netl-earth-day-720-x-1280.mp4"},{"vid_id":"11","title":"Air Pollution ","image":"http://srishti-systems.info/projects/MyKids/Uploads/196088-craft14.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/56702-air-pollution-#aumsum-480-x-854.mp4"},{"vid_id":"12","title":"Greenhouse Effect","image":"http://srishti-systems.info/projects/MyKids/Uploads/487560-craft15.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/545496-greenhouse-effect-#aumsum-480-x-854.mp4"}]
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
         * vid_id : 1
         * title : Potential and Kinetic Energy
         * image : http://srishti-systems.info/projects/MyKids/Uploads/406276-energy.png
         * video : http://srishti-systems.info/projects/MyKids/Uploads/473609-potential-and-kinetic-energy-#aumsum-360-x-640.mp4
         */

        private String vid_id;
        private String title;
        private String image;
        private String video;

        public String getVid_id() {
            return vid_id;
        }

        public void setVid_id(String vid_id) {
            this.vid_id = vid_id;
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
