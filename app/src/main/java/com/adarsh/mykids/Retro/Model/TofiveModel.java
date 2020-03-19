package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class TofiveModel {

    /**
     * status : success
     * Videos : [{"video_id":"1","age":"5","title":"Johny Johny Yes Papa","image":"http://srishti-systems.info/projects/MyKids/Uploads/340162-johnny.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/299743-johnyy.mp4"},{"video_id":"2","age":"5","title":"Number Song 1-10","image":"http://srishti-systems.info/projects/MyKids/Uploads/906908-number.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/569046-numbers-song.mp4"},{"video_id":"3","age":"5","title":"Phonics Song with TWO Words","image":"http://srishti-systems.info/projects/MyKids/Uploads/581874-apple.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/684971-phonics-song-with-two-words.mp4"},{"video_id":"5","age":"5","title":"Wash Your Hands Song for Kids  Good Habits Nursery Rhymes ","image":"http://srishti-systems.info/projects/MyKids/Uploads/677442-wash.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/818646-wash-your-hands-song-for-kids-good-habits-nursery-rhymes-for-children-720-x-1280.mp4"},{"video_id":"6","age":"5","title":"Twinkle Twinkle Little Star","image":"http://srishti-systems.info/projects/MyKids/Uploads/166152-stars.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/256855-twinkle-twinkle-little-star-cocomelon-nursery-rhymes-&-kids-songs-720-x-1280.mp4"},{"video_id":"7","age":"5","title":"No No Brush My Teeth Song","image":"http://srishti-systems.info/projects/MyKids/Uploads/476732-teeth.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/715246-no-no-brush-my-teeth-song---chuchu-tv-nursery-rhymes-&-kids-songs-720-x-1280.mp4"},{"video_id":"8","age":"5","title":"Our Favorite Bedtime Songs","image":"http://srishti-systems.info/projects/MyKids/Uploads/965326-night.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/956196-our-favorite-bedtime-songs-twinkle-twinkle-little-star,-sweet-dreams,-480-x-854.mp4"},{"video_id":"9","age":"5","title":"Our Family - Nursery Rhymes","image":"http://srishti-systems.info/projects/MyKids/Uploads/457355-family.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/626950-our-family---nursery-rhymes-for-children-360-x-640.mp4"},{"video_id":"15","age":"5","title":"Kids vocabulary - Body - parts of the body","image":"http://srishti-systems.info/projects/MyKids/Uploads/193945-body.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/144296-kids-vocabulary---body---parts-of-the-body---learn-english-for-kids---480-x-854.mp4"},{"video_id":"17","age":"5","title":"Ringa Ringa Roses  Ring Around the Rosie","image":"http://srishti-systems.info/projects/MyKids/Uploads/514260-roses.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/940626-ringa-ringa-roses-ring-around-the-rosie--3d-kid's-songs-&-nursery-rhy-480-x-854.mp4"},{"video_id":"18","age":"5","title":"Five Little Monkeys Jumping on the bed","image":"http://srishti-systems.info/projects/MyKids/Uploads/544067-monnn.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/117876-five-little-monkeys-jumping-on-the-bed---3d-animation-english-nursery-360-x-640.mp4"}]
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
         * video_id : 1
         * age : 5
         * title : Johny Johny Yes Papa
         * image : http://srishti-systems.info/projects/MyKids/Uploads/340162-johnny.png
         * video : http://srishti-systems.info/projects/MyKids/Uploads/299743-johnyy.mp4
         */

        private String video_id;
        private String age;
        private String title;
        private String image;
        private String video;

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
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
