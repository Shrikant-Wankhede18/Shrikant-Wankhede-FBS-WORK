package inheritance;

public class SocialMediaAccount {
	String userName;
	boolean isPublic;
	boolean isVerified;
	String countryOrigin;
	int noOfPosts;
	String createdAt;
	
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	boolean isPublic() {
		return isPublic;
	}
	void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	boolean isVerified() {
		return isVerified;
	}
	void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	String getCountryOrigin() {
		return countryOrigin;
	}
	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	 int getNoOfPosts() {
		return noOfPosts;
	}
	void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}
	String getCreatedAt() {
		return createdAt;
	}
	void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}//getters and setters ends here
	
	
SocialMediaAccount(){
		this.userName = "shrii_18";
		this.isPublic = true;
		this.isVerified = false;
		this.countryOrigin = "Australia";
		this.noOfPosts = 14;
		this.createdAt = "22 DEC 2011";
	}
	
	
	SocialMediaAccount(String userName, boolean isPublic, boolean isVerified, String countryOrigin,int noOfPosts,String ceratedAt){
		
		this.userName = userName;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.countryOrigin = countryOrigin;
		this.noOfPosts = noOfPosts;
		this.createdAt = ceratedAt;
	}// constructors ends here
	
	
	void display() {
		System.out.println("UserName is : " +this.userName);
		System.out.println("Public Or Not : " +this.isPublic);
		System.out.println("Verified : " +this.isVerified);
		System.out.println("country Origin : " +this.countryOrigin);
		System.out.println("no of Posts : " +this.noOfPosts);
		System.out.println("Created At : " +this.createdAt);
		
		
	}//Display ends here
	
	
}// class Social Media ends here


class InstagramAccount extends SocialMediaAccount{
	int noOfFollowers;
	int noOfHighlights;
	int noOfStoryArchived;
	int noOfPostArchived;
	
	int getNoOfFollowers() {
		return noOfFollowers;
	}
	void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}
	int getNoOfHighlights() {
		return noOfHighlights;
	}
	void setNoOfHighlights(int noOfHighlights) {
		this.noOfHighlights = noOfHighlights;
	}
	int getNoOfStoryArchived() {
		return noOfStoryArchived;
	}
	void setNoOfStoryArchived(int noOfStoryArchived) {
		this.noOfStoryArchived = noOfStoryArchived;
	}
	int getNoOfPostArchived() {
		return noOfPostArchived;
	}
	void setNoOfPostArchived(int noOfPostArchived) {
		this.noOfPostArchived = noOfPostArchived;
	}// getters and setters ends here
	
	
	
	
	
	InstagramAccount(String userName, boolean isPublic, boolean isVerified, String countryOrigin, int noOfPosts,
			String ceratedAt,int a,int b,int c,int d) {
		super(userName, isPublic, isVerified, countryOrigin, noOfPosts, ceratedAt);
		this.noOfFollowers =a;
		this.noOfHighlights = b;
		this.noOfStoryArchived =c;
		this.noOfPostArchived = d;
		
	}
	InstagramAccount() {
		super();
		this.noOfFollowers =16000;
		this.noOfHighlights = 21;
		this.noOfStoryArchived =10;
		this.noOfPostArchived = 18;
	}// constructors ends here
	
	void display() {
		super.display();
		System.out.println("NO Of followers : " +this.noOfFollowers);
		System.out.println("No Of highlights : " +this.noOfHighlights);
		System.out.println("no of story Archived: " +this.noOfStoryArchived);
		System.out.println("post archived : " +this.noOfPostArchived);
		
		
		
	}//Display ends here
	
	
}// class Instagram account ends here

class LinkdinAccount extends SocialMediaAccount{
	int noOfConnections;
	int noOfProfileViews;
	int noOfJobsApplied;
	
	int getNoOfConnections() {
		return noOfConnections;
	}
	void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}
	int getNoOfProfileViews() {
		return noOfProfileViews;
	}
	void setNoOfProfileViews(int noOfProfileViews) {
		this.noOfProfileViews = noOfProfileViews;
	}
	int getNoOfJobsApplied() {
		return noOfJobsApplied;
	}
	void setNoOfJobsApplied(int noOfJobsApplied) {
		this.noOfJobsApplied = noOfJobsApplied;
	}// getters and setters
	
	
	LinkdinAccount() {
		this.noOfConnections = 45;
		this.noOfProfileViews =867;
		this.noOfJobsApplied = 10;
	}
	
	LinkdinAccount(String userName, boolean isPublic, boolean isVerified, String countryOrigin, int noOfPosts,
			String ceratedAt,int noOfConnections, int noOfProfileViews, int noOfJobsApplied) {
		super(userName, isPublic, isVerified, countryOrigin, noOfPosts, ceratedAt);
		this.noOfConnections = noOfConnections;
		this.noOfProfileViews = noOfProfileViews;
		this.noOfJobsApplied = noOfJobsApplied;
	}// constructors ends here
	
	
	void display() {
		super.display();
		System.out.println("NO Of connections : " +this.noOfConnections );
		System.out.println("No Of Profile views : " +this.noOfProfileViews);
		System.out.println("no of Jobs Applied : " +this.noOfJobsApplied);
		
		
		
		
	}//Display ends here
	
	
	
	
}// class Linkdin ends here

class YoutubeAccount extends SocialMediaAccount{
	int noOfSubscribesrs;
	double watchTime;
	boolean isMonitiezed;
	double estimatedRevenue;
	public int getNoOfSubscribesrs() {
		return noOfSubscribesrs;
	}
	void setNoOfSubscribesrs(int noOfSubscribesrs) {
		this.noOfSubscribesrs = noOfSubscribesrs;
	}
	double getWatchTime() {
		return watchTime;
	}
	void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}
	boolean isMonitiezed() {
		return isMonitiezed;
	}
	void setMonitiezed(boolean isMonitiezed) {
		this.isMonitiezed = isMonitiezed;
	}
	double getEstimatedRevenue() {
		return estimatedRevenue;
	}
	void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}// getters and setters ends here
	
	YoutubeAccount(String userName, boolean isPublic, boolean isVerified, String countryOrigin, int noOfPosts,
			String ceratedAt,int noOfSubscribesrs, double watchTime, boolean isMonitiezed, double estimatedRevenue) {
		super(userName, isPublic, isVerified, countryOrigin, noOfPosts, ceratedAt);
		this.noOfSubscribesrs = noOfSubscribesrs;
		this.watchTime = watchTime;
		this.isMonitiezed = isMonitiezed;
		this.estimatedRevenue = estimatedRevenue;
	}
	YoutubeAccount() {
		super();
		this.noOfSubscribesrs =3465;
		this.watchTime = 2567.0;
		this.isMonitiezed = false;
		this.estimatedRevenue =12367.00;
	}// Constructors Ends here
	
	void display() {
		super.display();
		System.out.println("NO Of Subscribers: " +this.noOfSubscribesrs );
		System.out.println("No Of watch time: " +this.watchTime);
		System.out.println("Monitized : " +this.isMonitiezed );
		System.out.println("Estimate Revenue : " +this.estimatedRevenue );
		
		
		
		
	}//Display ends here
	
	
}// class Youtube ends here

class TestSocialMedia{
	public static void main(String[] args) {
		
		InstagramAccount ia1= new InstagramAccount();
		ia1.display();
		System.out.println("___________________________________");
		LinkdinAccount la1= new LinkdinAccount();
		la1.display();
		System.out.println("___________________________________");
		YoutubeAccount ya1= new YoutubeAccount();
		ya1.display();
		System.out.println("___________________________________");
	
	}
}
