package com.adarsh.mykids.Retro;

import java.util.List;

public class ViewHealthConditionsModel {

    /**
     * status : success
     * health : [{"health_id":"3","title":"Chest and Lungs","description":"Healthy lungs are crucial to your child's well-being. The lungs can get infections that, when serious, can cause chronic and sometimes life-threatening illnesses."},{"health_id":"4","title":"Chronic","description":"Ten to twenty million children and adolescents in the United States have some form of chronic illness or disability. Chronic refers to a health condition that lasts anywhere from three months to a lifetime."},{"health_id":"5","title":"Cleft and Craniofacial","description":"Children with a cleft lip, cleft palate, or craniofacial disorder often have complex needs and may undergo a variety of procedures and therapies. Often, multiple pediatric specialists and surgeons are required to provide comprehensive care."},{"health_id":"7","title":"Emotional Problems","description":"Children's temperaments vary and thus they are quite different in their ability to cope with stress and daily hassles. Some are easygoing by nature and adjust easily to events and new situations. Others are thrown off balance by changes in their lives."},{"health_id":"8","title":"Eyes","description":"Middle childhood is a common time for the recognition of vision problems, especially when children first have assigned seats in classrooms. Vision screening, an important part of your child's checkups, may reveal the need for further vision testing."},{"health_id":"9","title":"Fever","description":"A fever is usually caused by infections from viruses (such as a cold or the flu) or bacteria (such as strep throat or some ear infections). The fever itself is not the disease, only a sign that the body's defenses are trying to fight an infection."},{"health_id":"10","title":"Genitals and Urinary Tract","description":"The urinary tract includes the kidneys, ureters, and the bladder while the genital system includes the reproductive organs. While urinary tract infections are common in young children, there are other illnesses or diseases that can affect these areas of the body as well."},{"health_id":"11","title":"Head, Neck and Nervous System","description":"During childhood your son or daughter may experience a variety of neurological disorders. Many of these conditions are not cause for concern and go away on their own. For more serious conditions, a pediatric neurosurgeon can diagnose, treat, and manage children's nervous system problems and head and spinal deformities."},{"health_id":"12","title":"Heart","description":"A number of heart conditions can affect children. Some are structural abnormalities they are born with. Others deal with the electrical system that controls the heartbeat. Concern about a heart problem often causes patients and parents a lot of anxiety. Many times, the symptoms described by children are not because of a problem with the heart. The following articles will give you information about common heart problems encountered in childhood. If you have a concern about your child's heart, please discuss it with your pediatrician."},{"health_id":"13","title":"Infections","description":"Despite their microscopic size, viruses are responsible for many childhood illnesses. When viruses invade human cells, they take over the cell's machinery to reproduce. As they grow in number they can cause illnesses, some of the serious."},{"health_id":"14","title":"Obesity","description":"Various factors can influence the likelihood of a child's becoming overweight. Obesity is usually defined as more than 20 percent above ideal weight for a particular height and age."},{"health_id":"15","title":"Orthopedic","description":"As your child matures, calcium is necessary for healthy bone development. An inadequate calcium intake during childhood can not only affect present growth but might also help contribute to the development of weakened and porous bones (osteoporosis) later in life."},{"health_id":"16","title":"Seizures","description":"There are many different types of seizures. Some are very short, lasting only a few seconds, while others can last longer. The term epilepsy is used to describe seizures that occur repeatedly over time without an illness or brain injury. The collection of articles below covers the diagnosis and treatment of seizures as well as information on the support children and families may need when managing seizures."}]
     */

    private String status;
    private List<HealthBean> health;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<HealthBean> getHealth() {
        return health;
    }

    public void setHealth(List<HealthBean> health) {
        this.health = health;
    }

    public static class HealthBean {
        /**
         * health_id : 3
         * title : Chest and Lungs
         * description : Healthy lungs are crucial to your child's well-being. The lungs can get infections that, when serious, can cause chronic and sometimes life-threatening illnesses.
         */

        private String health_id;
        private String title;
        private String description;

        public String getHealth_id() {
            return health_id;
        }

        public void setHealth_id(String health_id) {
            this.health_id = health_id;
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
