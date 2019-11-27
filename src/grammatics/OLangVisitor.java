package grammatics;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface OLangVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link OLangParser#classDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassDeclaration(OLangParser.ClassDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#className}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassName(OLangParser.ClassNameContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#memberDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMemberDeclaration(OLangParser.MemberDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#variableDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableDeclaration(OLangParser.VariableDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#methodDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodDeclaration(OLangParser.MethodDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#parameters}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameters(OLangParser.ParametersContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#parameterDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameterDeclaration(OLangParser.ParameterDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBody(OLangParser.BodyContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#constructorDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstructorDeclaration(OLangParser.ConstructorDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(OLangParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(OLangParser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#whileLoop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileLoop(OLangParser.WhileLoopContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatement(OLangParser.IfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#returnStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnStatement(OLangParser.ReturnStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(OLangParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#arguments}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArguments(OLangParser.ArgumentsContext ctx);

    /**
     * Visit a parse tree produced by {@link OLangParser#primary}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimary(OLangParser.PrimaryContext ctx);
}