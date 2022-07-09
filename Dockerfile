FROM tanmoy221991/tanmoypublic:mychromebox-1.1
WORKDIR /demoapp
COPY . .
ENTRYPOINT ["/bin/bash","-c"]
CMD ["mvn test"]