package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class ParentalTipsModel {

    /**
     * status : success
     * Tips : [{"tip_id":"1","topic":"Be A Good Role Model","description":"Human is a special species in part because we can learn by imitation\u200b1\u200b . We are programmed to copy other\u2019s actions to understand them and to incorporate them into our own. Children, in particular, watch everything their parents do very carefully.  So, be the person you want your child to be \u2014 respect your child, show them positive behavior and attitude, have empathy towards your child\u2019s emotion \u2014 and your child will follow suit.","photo":"http://srishti-systems.info/projects/MyKids/Uploads/546387-my-family_home-life_how-to-be-a-good-role-model-for-your-kids_how-to-be-a-good-role-model-for-kids-high-five-png_lang-en-ie.jpg"},{"tip_id":"2","topic":"Love Them And Show Them Through Action","description":"You can show love through actions by giving massages. You can show love through actions by making them dinner, tea, coffee, or making something special for them. You can show love through actions by supporting them when they cry, need encouragement and stay with them until you know they'll be okay when you leave.","photo":"http://srishti-systems.info/projects/MyKids/Uploads/315406-lovvvv.jpg"},{"tip_id":"3","topic":"Practice Kind And Firm Positive Parenting","description":"Babies are born with around 100 billion brain cells (neurons) with relatively little connections. These connections create our thoughts, drive our actions, shape our personalities and basically determine who we are. They are created, strengthened and \u201csculpted\u201d through experiences across our lives.  Give your child positive experiences. They will have the ability to experience positive experiences themselves and offer them to others","photo":"http://srishti-systems.info/projects/MyKids/Uploads/82516-yyy.jpeg"},{"tip_id":"4","topic":"Be A Safe Haven For Your Child","description":"Let your child know that you\u2019ll always be there for them by being responsive to the child\u2019s signals and sensitive to their needs. Support and accept your child as an individual. Be a warm, safe haven for your child to explore from.  Children raised by parents who are consistently responsive tend to have better emotional development, social development, and mental health outcomes.","photo":"http://srishti-systems.info/projects/MyKids/Uploads/767753-chhh.jpeg"},{"tip_id":"5","topic":"Talk With Your Child And Help Their Brains Integrate","description":"Most of us already know the importance of communication. Talk to your child and also listen to them carefully.  By keeping an open line of communication, you\u2019ll have a better relationship with your child and your child will come to you when there\u2019s a problem.  But there\u2019s another reason for communication \u2014 you help your child integrate different parts of his/her brain.","photo":"http://srishti-systems.info/projects/MyKids/Uploads/625207-"},{"tip_id":"6","topic":"Talk With Your Child And Help Their Brains Integrate","description":"Most of us already know the importance of communication. Talk to your child and also listen to them carefully.  By keeping an open line of communication, you\u2019ll have a better relationship with your child and your child will come to you when there\u2019s a problem.  But there\u2019s another reason for communication \u2014 you help your child integrate different parts of his/her brain.","photo":"http://srishti-systems.info/projects/MyKids/Uploads/356778-fff.jpg"},{"tip_id":"7","topic":"Avoid negative emotional reactions, such as anger, sarcasm, and ridicule.","description":"If your child has problems with control, negativity will only make him or her feel worse. Use short and mild suggestions to remind your child to focus, like \u201cP.A.\u201d for \u201cpay attention.\u201d","photo":"http://srishti-systems.info/projects/MyKids/Uploads/963799-89.jpg"},{"tip_id":"8","topic":"Parent by example.","description":"Think of your kids as little bipedal copy machines who will mimic everything you do. If you behave badly, you are giving them permission to act in the same ways. Check in with yourself, and don\u2019t lose it in front of the children.","photo":"http://srishti-systems.info/projects/MyKids/Uploads/437990-crying-little-girl.jpg"}]
     */

    private String status;
    private List<TipsBean> Tips;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TipsBean> getTips() {
        return Tips;
    }

    public void setTips(List<TipsBean> Tips) {
        this.Tips = Tips;
    }

    public static class TipsBean {
        /**
         * tip_id : 1
         * topic : Be A Good Role Model
         * description : Human is a special species in part because we can learn by imitation​1​ . We are programmed to copy other’s actions to understand them and to incorporate them into our own. Children, in particular, watch everything their parents do very carefully.  So, be the person you want your child to be — respect your child, show them positive behavior and attitude, have empathy towards your child’s emotion — and your child will follow suit.
         * photo : http://srishti-systems.info/projects/MyKids/Uploads/546387-my-family_home-life_how-to-be-a-good-role-model-for-your-kids_how-to-be-a-good-role-model-for-kids-high-five-png_lang-en-ie.jpg
         */

        private String tip_id;
        private String topic;
        private String description;
        private String photo;

        public String getTip_id() {
            return tip_id;
        }

        public void setTip_id(String tip_id) {
            this.tip_id = tip_id;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
    }
}
