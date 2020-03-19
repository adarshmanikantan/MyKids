package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class StoryModel {

    /**
     * status : success
     * Videos : [{"story_id":"1","title":"The Story of Two Pots","image":"http://srishti-systems.info/projects/MyKids/Uploads/479971-poisr.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/329382-the-story-of-two-pots-english-moral-story-animated-moral-storie-fair-720-x-1280.mp4"},{"story_id":"2","title":"Lazy Son","image":"http://srishti-systems.info/projects/MyKids/Uploads/76059-lazy.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/695577-lazy-son-moral-stories-for-kids-in-english-english-cartoon-maha-car-480-x-854.mp4"},{"story_id":"3","title":"Clever Fish","image":"http://srishti-systems.info/projects/MyKids/Uploads/955998-fiii.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/566264-clever-fish---english-stories-for-kids-moral-stories-in-english-shor-720-x-1280.mp4"},{"story_id":"4","title":"A Glass Of Milk","image":"http://srishti-systems.info/projects/MyKids/Uploads/173849-fiii.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/136097-a-glass-of-milk-english-animated-stories-for-kids-traditional-story-720-x-1280.mp4"},{"story_id":"5","title":"The Magic Pot","image":"http://srishti-systems.info/projects/MyKids/Uploads/805986-fiii.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/847787-the-magic-pot-story-stories-for-kids-traditional-story-t-series-480-x-854.mp4"},{"story_id":"6","title":"The Needle Tree","image":"http://srishti-systems.info/projects/MyKids/Uploads/656902-tree.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/975005-the-needle-tree-stories-for-kids-kids-hut-moral-stories-480-x-854.mp4"},{"story_id":"7","title":"The Greedy Dog","image":"http://srishti-systems.info/projects/MyKids/Uploads/96167-tree.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/883374-the-greedy-dog-moral-story-in-english-small-moral-story-for-kids-kid-720-x-1280.mp4"},{"story_id":"8","title":"The Red Rose","image":"http://srishti-systems.info/projects/MyKids/Uploads/199225-rosee.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/52117-the-red-rose-english-animated-stories-for-kids-traditional-story-t--720-x-1280.mp4"},{"story_id":"9","title":"The ant and the dove","image":"http://srishti-systems.info/projects/MyKids/Uploads/977754-ant.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/533796-the-ant-and-the-dove-best-short-stories-for-kids-in-english-480-x-854.mp4"},{"story_id":"10","title":"True Friendship","image":"http://srishti-systems.info/projects/MyKids/Uploads/271493-ant.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/729563-true-friendship---english-short-stories-for-kids---bedtime-stories-for-480-x-854.mp4"},{"story_id":"11","title":"Bad Habits","image":"http://srishti-systems.info/projects/MyKids/Uploads/403422-antyu.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/376641-bad-habits---moral-stories-for-kids-kids-learning-videos-(animation)-480-x-854.mp4"},{"story_id":"12","title":"Lion and the mouse","image":"http://srishti-systems.info/projects/MyKids/Uploads/784625-antyu.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/855612-lion-and-the-mouse-in-english-story-english-fairy-tales-480-x-854.mp4"},{"story_id":"13","title":"The Two Frogs","image":"http://srishti-systems.info/projects/MyKids/Uploads/737891-anty.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/930672-the-two-frogs-english-short-stories-for-children-#shortstories-kids-720-x-1280.mp4"},{"story_id":"14","title":"The Fox and the Grapes","image":"http://srishti-systems.info/projects/MyKids/Uploads/623679-ttt.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/886670-the-fox-and-the-grapes-english-bedtime-stories-short-stories-for-720-x-1280.mp4"},{"story_id":"15","title":"Thirsty Crow","image":"http://srishti-systems.info/projects/MyKids/Uploads/191714-tttttttt.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/60518-thirsty-crow---english-story-moral-stories-for-kids-panchatantra-tal-480-x-640.mp4"},{"story_id":"16","title":"Richard and the balloon man","image":"http://srishti-systems.info/projects/MyKids/Uploads/760377-opoo.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/865505-moral-stories-for-kids-bedtime-stories-stories-for-kids-in-english-480-x-854.mp4"},{"story_id":"17","title":"The Hardworking Mother","image":"http://srishti-systems.info/projects/MyKids/Uploads/46129-fgtuu.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/151952-the-hardworking-mother---good-habits-bedtime-stories-&-moral-stories-f-480-x-854.mp4"},{"story_id":"18","title":"Chika and his homework","image":"http://srishti-systems.info/projects/MyKids/Uploads/21133-gfyty.png","video":"http://srishti-systems.info/projects/MyKids/Uploads/125030-chika-and-his-homework---chuchutv-storytime-good-habits-bedtime-storie-720-x-1280.mp4"}]
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
         * story_id : 1
         * title : The Story of Two Pots
         * image : http://srishti-systems.info/projects/MyKids/Uploads/479971-poisr.png
         * video : http://srishti-systems.info/projects/MyKids/Uploads/329382-the-story-of-two-pots-english-moral-story-animated-moral-storie-fair-720-x-1280.mp4
         */

        private String story_id;
        private String title;
        private String image;
        private String video;

        public String getStory_id() {
            return story_id;
        }

        public void setStory_id(String story_id) {
            this.story_id = story_id;
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
