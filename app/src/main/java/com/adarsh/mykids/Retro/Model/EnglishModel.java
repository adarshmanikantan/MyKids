package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class EnglishModel {

    /**
     * status : success
     * Videos : [{"english_id":"1","title":"Alphabet song","image":"http://srishti-systems.info/projects/MyKids/Uploads/152753-iii.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/585614-phonics-song-with-two-words---cartoon-animation-nursery-rhymes-&-phoni-720-x-1280.mp4"},{"english_id":"2","title":"Birds Name","image":"http://srishti-systems.info/projects/MyKids/Uploads/819839-uyi.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/528394-birds-name-for-kids-basic-learning-preschool-[unit-#-10]-720-x-1280.mp4"},{"english_id":"3","title":"Fruits Name","image":"http://srishti-systems.info/projects/MyKids/Uploads/58636-try65.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/604464-learn-all-fruits-name-in-english-480-x-854.mp4"},{"english_id":"4","title":"Wild Animals and their sounds","image":"http://srishti-systems.info/projects/MyKids/Uploads/314678-wwwww.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/356024-wild-animal-sounds-for-kids-and-toddlers-480-x-854.mp4"},{"english_id":"5","title":"Animals and their young ones","image":"http://srishti-systems.info/projects/MyKids/Uploads/201348-tryyu.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/418269-animals-and-their-young-ones-for-kids-young-ones-of-animals-and-birds-480-x-854.mp4"},{"english_id":"6","title":"Domestic Animals","image":"http://srishti-systems.info/projects/MyKids/Uploads/615612-ggh.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/916124-learn-domestic-animals-animated-video-for-kids-english-animation-vid-480-x-854.mp4"},{"english_id":"7","title":"Daily Routines","image":"http://srishti-systems.info/projects/MyKids/Uploads/68075-tyyyuuuuu.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/647778-daily-routines-vocabulary-720-x-1280.mp4"},{"english_id":"8","title":"Parts of the house","image":"http://srishti-systems.info/projects/MyKids/Uploads/192106-ty76.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/265352-kids-vocabulary---house---parts-of-the-house---learn-english-for-kids-480-x-854.mp4"},{"english_id":"9","title":"My Day - Daily Routine","image":"http://srishti-systems.info/projects/MyKids/Uploads/584382-sa4.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/514362-kids-vocabulary---my-day---daily-routine---learn-english-for-kids---en-720-x-1280.mp4"},{"english_id":"10","title":"Opposite Words","image":"http://srishti-systems.info/projects/MyKids/Uploads/43558-99.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/852586-kids-vocabulary---opposite-words---learning-about-opposites---english-480-x-854.mp4"},{"english_id":"11","title":"Weather","image":"http://srishti-systems.info/projects/MyKids/Uploads/668782-56667.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/192090-kids-vocabulary---weather---how's-the-weather---learn-english-for-kids-480-x-854.mp4"}]
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
         * english_id : 1
         * title : Alphabet song
         * image : http://srishti-systems.info/projects/MyKids/Uploads/152753-iii.png
         * video : http://srishti-systems.info/projects/MyKids/Uploads/585614-phonics-song-with-two-words---cartoon-animation-nursery-rhymes-&-phoni-720-x-1280.mp4
         */

        private String english_id;
        private String title;
        private String image;
        private String video;

        public String getEnglish_id() {
            return english_id;
        }

        public void setEnglish_id(String english_id) {
            this.english_id = english_id;
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
