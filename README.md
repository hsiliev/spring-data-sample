To use the app:
```bash
# Start the app
./gradlew bootRun

# Create users
curl -i -X POST localhost:8080/user/a
curl -i -X POST localhost:8080/user/c
curl -i -X POST localhost:8080/user/b

# Get last user
curl -i localhost:8080/user/last
```

You can check H2 DB with your browser at http://localhost:8080/h2-console
