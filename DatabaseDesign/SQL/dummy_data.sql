USE test;

-- Partners Dummy Data (creates 30 entries)

INSERT INTO `Partners` (`FirstName`,`LastName`,`Phone`) VALUES 
("Jasper","Rosa","5378184316"),
("Leslie","Mcgee","7323244320"),
("Emerald","Reid","8178272883"),
("Tad","Howell","4334523234"),
("Merrill","Dillon","1488216636"),
("Heather","Roman","9561122461"),
("Stuart","Pittman","1826170166"),
("Lilah","Hopper","2874875602"),
("Cathleen","Ramirez","4382715865"),
("Geraldine","Short","1805347741"),
("Alea","Frederick","1196469521"),
("Gay","Moreno","1315743885"),
("Driscoll","Blanchard","9908705117"),
("Brian","Crosby","6511157830"),
("Buckminster","Wiggins","3076360684"),
("Kitra","Medina","7225110762"),
("Beverly","Sharpe","7702939526"),
("Harrison","Norman","1098199403"),
("Alexa","Martinez","5105991300"),
("Silas","Gardner","2292369129"),
("Nichole","Reese","7973565031"),
("Adria","Estes","4753889493"),
("Athena","Bentley","6585771556"),
("Damon","Maynard","1778758790"),
("Kay","Morgan","8437883393"),
("Stewart","Mathews","4059830758"),
("Lars","Warner","6207072606"),
("Nash","Nguyen","7568201042"),
("Delilah","Harding","2074807993"),
("Joan","Livingston","1695312657");

select * from test.Partners;

-- Locations Dummy Data (creates 30 entries)

INSERT INTO `Locations` (`City`,`State`,`AddressLine1`,`AddressLine2`,`Country`,`Zipcode`,`isPrimary`) VALUES 
("Jackson","Mississippi","122 Ultrices, Street","lacinia at,","Switzerland","21585",0),
("Newark","Delaware","P.O. Box 459, 3324 Gravida. Road","ultrices posuere cubilia Curae;","Kazakhstan","40115",0),
("Columbia","MO","Ap #255-7700 Sed Street","nunc ac","Cambodia","09744",1),
("Fort Collins","Colorado","Ap #654-7461 Ac Av.","egestas ligula.","France","0579 VC",1),
("Springfield","MA","Ap #781-3395 Eget St.","tortor nibh","Maldives","502364",0),
("Richmond","Virginia","Ap #438-7275 Mi Rd.","lacus.","Botswana","28508",1),
("Kapolei","HI","544-3280 Etiam Road","quis lectus.","Equatorial Guinea","9566",0),
("Henderson","Nevada","P.O. Box 851, 7911 Massa. Road","libero","Moldova","924578",1),
("Colorado Springs","Colorado","P.O. Box 329, 5445 Penatibus Av.","nulla at sem molestie","New Zealand","71369",0),
("Knoxville","Tennessee","P.O. Box 255, 639 Eu St.","sociis natoque penatibus","Estonia","96902",0),
("Provo","UT","P.O. Box 816, 241 Ligula. Rd.","velit in","Sri Lanka","09059",1),
("Baltimore","MD","P.O. Box 871, 5296 Parturient Ave","Maecenas libero est,","Mozambique","115144",1),
("Honolulu","Hawaii","P.O. Box 749, 9583 Sed St.","Maecenas libero est, congue","Montenegro","54811",1),
("Pittsburgh","Pennsylvania","1416 Consectetuer, St.","Morbi accumsan laoreet ipsum.","Tonga","04229-973",0),
("Hattiesburg","MS","850-995 Lorem Avenue","ligula tortor, dictum","United States","6266",0),
("Annapolis","MD","532-9057 Porttitor Avenue","purus. Maecenas libero","Malta","16314",1),
("Lexington","KY","Ap #757-9497 Quam Road","risus.","Bouvet Island","31377",1),
("Orlando","FL","P.O. Box 691, 8387 Tellus Av.","Cras dolor dolor, tempus","Greece","4776",0),
("Metairie","LA","P.O. Box 726, 9250 Feugiat. Avenue","quis lectus. Nullam suscipit,","Pakistan","8719",0),
("Akron","OH","P.O. Box 411, 8133 Nascetur Ave","sit amet luctus vulputate,","Saint Pierre and Miquelon","04352",0),
("Lowell","Massachusetts","Ap #331-5025 Neque. St.","euismod in, dolor. Fusce","Costa Rica","X6P 1N9",0),
("Kansas City","KS","563-5340 Nisl. Rd.","at","Mali","87987",1),
("Jackson","MS","Ap #142-3088 Tristique Ave","lorem,","Bonaire, Sint Eustatius","9789",1),
("Metairie","LA","8917 Non Rd.","velit in","Comoros","73213",0),
("Augusta","Maine","931-9652 Pharetra Av.","magna sed","Guatemala","42206",1),
("Overland Park","Kansas","8258 Fermentum St.","Phasellus libero mauris, aliquam","Guam","5133",1),
("Wilmington","DE","P.O. Box 435, 897 Sem Rd.","gravida sagittis. Duis","Palau","V9Z 0S0",0),
("Knoxville","TN","857 Quam. Av.","erat, eget tincidunt dui","Iran","606788",0),
("Boston","MA","263-1692 Consectetuer Road","iaculis","Portugal","H9I 4KN",0),
("Racine","WI","Ap #608-8919 Pulvinar Rd.","vitae sodales nisi magna","Uruguay","43598-845",1);

-- Roles Dummy Data (creates 4 entries)

INSERT INTO `Roles` (`Description`) VALUES 
("mi enim, condimentum eget,"),
("eros. Proin ultrices. Duis"),
("Nunc mauris sapien, cursus"),
("eu eros. Nam consequat");

-- Positions Dummy Data (Creates 30 entries)

INSERT INTO `Positions` (`Title`,`Description`,`LocationID`,`PartnerID`) VALUES 
("Aenean euismod mauris","gravida. Aliquam tincidunt, nunc ac mattis ornare, lectus ante dictum mi, ac mattis velit justo nec ante. Maecenas mi felis,",20,14),
("diam lorem, auctor","erat nonummy ultricies ornare, elit elit fermentum risus, at fringilla purus mauris a nunc. In at pede. Cras vulputate velit",10,20),
("urna justo faucibus","sed, hendrerit a, arcu. Sed et libero. Proin mi. Aliquam gravida mauris ut mi. Duis risus odio, auctor vitae, aliquet",7,3),
("Nunc commodo auctor","elit pede, malesuada vel, venenatis vel, faucibus id, libero. Donec consectetuer mauris id sapien. Cras dolor dolor, tempus non, lacinia",29,14),
("eu erat semper","faucibus orci luctus et ultrices posuere cubilia Curae; Phasellus ornare. Fusce mollis. Duis sit amet diam eu dolor egestas rhoncus.",24,15),
("Cras dictum ultricies","rhoncus id, mollis nec, cursus a, enim. Suspendisse aliquet, sem ut cursus luctus, ipsum leo elementum sem, vitae aliquam eros",5,1),
("nisi dictum augue","blandit mattis. Cras eget nisi dictum augue malesuada malesuada. Integer id magna et ipsum cursus vestibulum. Mauris magna. Duis dignissim",15,17),
("erat eget ipsum.","Donec dignissim magna a tortor. Nunc commodo auctor velit. Aliquam nisl. Nulla eu neque pellentesque massa lobortis ultrices. Vivamus rhoncus.",8,18),
("non justo. Proin","orci tincidunt adipiscing. Mauris molestie pharetra nibh. Aliquam ornare, libero at auctor ullamcorper, nisl arcu iaculis enim, sit amet ornare",26,26),
("ullamcorper viverra. Maecenas","ridiculus mus. Proin vel nisl. Quisque fringilla euismod enim. Etiam gravida molestie arcu. Sed eu nibh vulputate mauris sagittis placerat.",3,30),
("nec, mollis vitae,","Donec luctus aliquet odio. Etiam ligula tortor, dictum eu, placerat eget, venenatis a, magna. Lorem ipsum dolor sit amet, consectetuer",22,12),
("vel pede blandit","at augue id ante dictum cursus. Nunc mauris elit, dictum eu, eleifend nec, malesuada ut, sem. Nulla interdum. Curabitur dictum.",22,3),
("tellus. Suspendisse sed","at, egestas a, scelerisque sed, sapien. Nunc pulvinar arcu et pede. Nunc sed orci lobortis augue scelerisque mollis. Phasellus libero",29,10),
("metus. Aenean sed","nec metus facilisis lorem tristique aliquet. Phasellus fermentum convallis ligula. Donec luctus aliquet odio. Etiam ligula tortor, dictum eu, placerat",20,29),
("luctus felis purus","tortor at risus. Nunc ac sem ut dolor dapibus gravida. Aliquam tincidunt, nunc ac mattis ornare, lectus ante dictum mi,",22,17),
("viverra. Donec tempus,","diam dictum sapien. Aenean massa. Integer vitae nibh. Donec est mauris, rhoncus id, mollis nec, cursus a, enim. Suspendisse aliquet,",7,19),
("lorem vitae odio","fames ac turpis egestas. Fusce aliquet magna a neque. Nullam ut nisi a odio semper cursus. Integer mollis. Integer tincidunt",17,12),
("dui, nec tempus","sagittis. Nullam vitae diam. Proin dolor. Nulla semper tellus id nunc interdum feugiat. Sed nec metus facilisis lorem tristique aliquet.",2,22),
("Duis ac arcu.","odio semper cursus. Integer mollis. Integer tincidunt aliquam arcu. Aliquam ultrices iaculis odio. Nam interdum enim non nisi. Aenean eget",4,2),
("ipsum cursus vestibulum.","in consectetuer ipsum nunc id enim. Curabitur massa. Vestibulum accumsan neque et nunc. Quisque ornare tortor at risus. Nunc ac",1,29),
("adipiscing fringilla, porttitor","in magna. Phasellus dolor elit, pellentesque a, facilisis non, bibendum sed, est. Nunc laoreet lectus quis massa. Mauris vestibulum, neque",13,20),
("sagittis. Nullam vitae","cursus vestibulum. Mauris magna. Duis dignissim tempor arcu. Vestibulum ut eros non enim commodo hendrerit. Donec porttitor tellus non magna.",15,11),
("Aliquam ornare, libero","egestas a, scelerisque sed, sapien. Nunc pulvinar arcu et pede. Nunc sed orci lobortis augue scelerisque mollis. Phasellus libero mauris,",5,4),
("Donec at arcu.","pellentesque eget, dictum placerat, augue. Sed molestie. Sed id risus quis diam luctus lobortis. Class aptent taciti sociosqu ad litora",11,29),
("Donec vitae erat","nostra, per inceptos hymenaeos. Mauris ut quam vel sapien imperdiet ornare. In faucibus. Morbi vehicula. Pellentesque tincidunt tempus risus. Donec",24,9),
("Nulla tempor augue","natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean eget magna. Suspendisse tristique neque venenatis lacus. Etiam bibendum",28,9),
("et ipsum cursus","Fusce aliquet magna a neque. Nullam ut nisi a odio semper cursus. Integer mollis. Integer tincidunt aliquam arcu. Aliquam ultrices",11,19),
("Nullam suscipit, est","tempor, est ac mattis semper, dui lectus rutrum urna, nec luctus felis purus ac tellus. Suspendisse sed dolor. Fusce mi",23,7),
("est. Nunc ullamcorper,","cursus luctus, ipsum leo elementum sem, vitae aliquam eros turpis non enim. Mauris quis turpis vitae purus gravida sagittis. Duis",24,17),
("non nisi. Aenean","a odio semper cursus. Integer mollis. Integer tincidunt aliquam arcu. Aliquam ultrices iaculis odio. Nam interdum enim non nisi. Aenean",16,26);

-- Users Dummy Data (Creates 30 entries)

INSERT INTO `Users` (`FirstName`,`LastName`,`RoleID`,`Email`,`Password`) VALUES 
("Channing","Frye",3,"id@Suspendisse.com","JDR68DHW9ER"),
("Shelly","Hardy",3,"nisl@ac.net","SPM61JWK0WP"),
("Debra","Velasquez",4,"orci@tellusfaucibus.ca","IIP54DVG3XC"),
("Abraham","Strong",4,"ac.turpis.egestas@eteuismod.net","GII16WTQ4VP"),
("Cody","Hale",2,"nunc.risus.varius@etnuncQuisque.co.uk","IPL48NOA1GJ"),
("Noble","May",4,"quam.Pellentesque.habitant@Cum.org","YDM37ZVU9JG"),
("Bruce","Day",1,"nec.urna@Sedetlibero.com","ZGM80CSN5JH"),
("Kalia","Sutton",4,"Cum@laoreet.com","PUX04AEZ0AT"),
("Alec","Cortez",2,"Quisque@Crasegetnisi.net","ROD08JJJ9VS"),
("Illana","Obrien",2,"iaculis.aliquet@in.co.uk","PKQ96ALZ7XQ"),
("Bruno","Kirkland",2,"vel@gravidanonsollicitudin.com","AAA69ZEA9EI"),
("Palmer","Juarez",3,"erat.Vivamus.nisi@rutrumurnanec.org","HDE61AGE5MF"),
("Odysseus","Gates",4,"in@Vestibulumuteros.edu","PIC84FZL7MQ"),
("Dieter","Rivera",3,"sit.amet.lorem@etarcu.org","MYT37KYR6AK"),
("Vance","Mcleod",3,"pellentesque@turpisnon.co.uk","CGB78OSM0FC"),
("Diana","Boyd",2,"vitae.purus.gravida@quis.com","ACN68QAX3QH"),
("Murphy","Hurley",1,"lacus.Etiam@liberoatauctor.com","MCP78ZCY6HQ"),
("Idona","Colon",1,"elit@acfermentum.org","EPW21QSX7PR"),
("Prescott","Burke",4,"Sed.malesuada.augue@at.net","JIB52PKM5WG"),
("Allen","Morrison",3,"sem@nibhvulputate.edu","SGR28EGX9QU"),
("Alexander","Alvarez",2,"pede@acturpis.co.uk","NKI64UJX4KL"),
("Craig","Wall",4,"lectus.Cum@vestibulumMauris.edu","RDD56BRD1WF"),
("Dorothy","Campos",2,"pellentesque@Donec.edu","EPE31VYS3JP"),
("Sage","Wiley",1,"Mauris.ut@hendreritDonecporttitor.net","PXY32VAN0RV"),
("Ursula","Compton",3,"Fusce.mollis@magnased.net","DVR87YMJ5CT"),
("Karina","Nichols",1,"eget.varius@adipiscingelit.co.uk","OJL00FXZ8EU"),
("Quentin","Black",4,"in.magna.Phasellus@Aliquamultrices.co.uk","JNE08SSB4RO"),
("Vaughan","Shelton",3,"euismod.est@sodales.co.uk","POO33XAK3GY"),
("Victor","Miller",2,"dolor.vitae@vulputateeuodio.org","ERJ54KJX3MH"),
("Drake","Sargent",4,"sed.facilisis.vitae@utodiovel.edu","ETK20DIW1GG");






