library(recommenderlab)

# Function to generate random romantic recommendation
generate_romantic_recommendation <- function(category) {
  if (category == "First Date") {
    first_date_recommendations <- c(
      "Plan a cozy dinner at a charming restaurant.",
      "Take a leisurely walk in a scenic park.",
      "Visit a local art gallery or museum together.",
      "Attend a fun and interactive cooking class.",
      "Explore a nearby town or city for a day trip."
    )
    return(sample(first_date_recommendations, 1))
  } else if (category == "Heartbroken") {
    heartbroken_recommendations <- c(
      "Spend a day pampering yourself with self-care.",
      "Lean on friends for support and have a movie night.",
      "Write down your feelings in a journal.",
      "Take a solo weekend getaway to clear your mind.",
      "Focus on personal growth through new hobbies."
    )
    return(sample(heartbroken_recommendations, 1))
  } else {
    return("Invalid category choice.")
  }
}

# Function to generate random professional recommendation
generate_professional_recommendation <- function() {
  professional_recommendations <- c(
    "Update your LinkedIn profile with recent achievements.",
    "Attend a networking event to expand your professional connections.",
    "Set specific career goals for the next six months.",
    "Take an online course to enhance your skills.",
    "Schedule a meeting with your mentor to discuss career growth."
  )
  return(sample(professional_recommendations, 1))
}

# Main loop
while (TRUE) {
  # Get user input for category
  cat_choice <- tolower(readline("Choose a category (Romantic/Professional), type 'exit' to quit: "))
  
  if (cat_choice == "exit") {
    break  # Exit the loop if the user types 'exit'
  }
  
  # Display recommendation based on user's choice
  if (cat_choice == "romantic") {
    romantic_category <- tolower(readline("Choose a sub-category (First Date/Heartbroken): "))
    print(generate_romantic_recommendation(romantic_category))
  } else if (cat_choice == "professional") {
    print(generate_professional_recommendation())
  } else {
    print("Invalid category choice.")
  }
}