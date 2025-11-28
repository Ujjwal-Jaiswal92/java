#!/bin/bash

shopt -s nullglob

while true; do
    java_files=(*.java)
    
    if [ ${#java_files[@]} -eq 0 ]; then
        echo "⚠️ No .java files found in this directory."
        exit 1
    fi

    echo ""
    echo "☕ What would you like to do?"
    echo "----------------------------------"
    echo "1. Run a specific Java file"
    echo "2. Run all Java files"
    echo "3. Exit"
    echo "----------------------------------"
    read -p "🎯 Enter your choice (1/2/3): " option

    case $option in
        1)
            echo ""
            echo "📜 Available Java files:"
            for i in "${!java_files[@]}"; do
                echo "$((i+1)). ${java_files[$i]}"
            done
            echo "----------------------------------"
            read -p "🔍 Enter the number of the file to run: " choice
            index=$((choice - 1))

            if [[ $index -ge 0 && $index -lt ${#java_files[@]} ]]; then
                file="${java_files[$index]}"
                class="${file%.java}"
                echo "🔧 Compiling: $file"

                if javac "$file"; then
                    echo "🚀 Running: $class"
                    echo "----------------------------------"
                    java "$class"
                    echo "✅ Done: $class"
                    rm "${class}.class"
                    echo "🧹 Cleaned: Deleted ${class}.class"
                else
                    echo "❌ Compilation failed for: $file"
                fi
            else
                echo "⚠️ Invalid selection."
            fi
            ;;

        2)
            echo ""
            echo "🛠️ Compiling and running all Java files..."
            echo "----------------------------------"
            for file in "${java_files[@]}"; do
                class="${file%.java}"
                echo "🔧 Compiling: $file"

                if javac "$file"; then
                    echo "🚀 Running: $class"
                    echo "----------------------------------"
                    java "$class"
                    echo "✅ Done: $class"
                    rm "${class}.class"
                    echo "🧹 Cleaned: Deleted ${class}.class"
                else
                    echo "❌ Compilation failed for: $file"
                fi
                echo "----------------------------------"
            done
            ;;

        3)
            echo "🌼 May your JVM run warm and your logic stay pure. Goodbye!"
            exit 0
            ;;

        *)
            echo "⚠️ Invalid option. Please choose 1, 2, or 3."
            ;;
    esac
done
