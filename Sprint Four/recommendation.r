
# Load the required libraries
library(recommenderlab)

# Create a sample user-item matrix (replace this with your actual data)
data <- matrix(c(5, NA, 3, 4, NA, 1, 2, 3, 4), nrow = 3, byrow = TRUE)
rownames(data) <- c("User1", "User2", "User3")
colnames(data) <- c("Item1", "Item2", "Item3")

# Convert the matrix to a recommenderlab sparse matrix
sparseData <- as(data, "realRatingMatrix")

# Split the data into training and test sets
set.seed(123)
splitData <- evaluationScheme(sparseData, method = "split", train = 0.8, given = 5)

# Build a collaborative filtering model using user-based approach
cfModel <- Recommender(splitData$train, method = "UBCF")

# Generate personalized recommendations for a specific user
userId <- "User1"
userRecs <- predict(cfModel, splitData$knownData[userId, ], n = 5)

# Show the recommendations
userRecs