FROM java:openjdk-8-jdk

ADD /var/jenkins_home/jobs/devops-compute-svc/workspace/devops-compute-svc/target/devops-compute-svc-1.0.jar /

EXPOSE 8101


CMD ["java", "-jar", "devops-compute-svc-1.0.jar"]